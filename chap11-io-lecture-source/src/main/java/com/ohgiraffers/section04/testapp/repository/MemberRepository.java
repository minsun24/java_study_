package com.ohgiraffers.section04.testapp.repository;

import com.ohgiraffers.section04.testapp.aggregate.AccountStatus;
import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.stream.MyObjectOutput;

import java.io.*;
import java.util.ArrayList;

/* 설명. 데이터베이스 개념(Member 관련 파일)과 입출력(CRUD)을 위해 만들어지며
     성공 데이터 또는 성공 실패 여부를 반환 (java의 컬렉션 개념으로 데이터를 관리하기도 한다.)
     => 성공에 따른 기능은 MemberService에서 담당
*/

public class MemberRepository {

    /* 설명. 초기에 Member 파일이 없다면 파일을 만들어 더미 데이터(dummy data)를 쌓는다. */
    private final ArrayList<Member> memberList = new ArrayList<>(); // 비어 있는 ArrayLis 생성

    // DB와의 연결 정보 (회원 목록 저장되어 있는 파일)
    private final File file =
            new File("src/main/java/com/ohgiraffers/section04/testapp/db/memberDB.dat");


    /* 설명. 프로그램 구동 시 MemberRepository 생성자가 호출되며, 초기에 실행할 내용들 */
    public MemberRepository() {
        if(!file.exists()) { // 파일이 존재하지 않는 경우
            // if문 만족할 때마 사용하는 배열
            ArrayList<Member> defaultMembers = new ArrayList<>();
            // 기본 더미 데이터 추가
            defaultMembers.add(new Member(1, "user01", "pass01", 20, new String[]{"발레", "수영"}, BloodType.A, AccountStatus.ACTIVATE));
            defaultMembers.add(new Member(2, "user02", "pass02", 15, new String[]{"게임", "영화시청"}, BloodType.B, AccountStatus.ACTIVATE));
            defaultMembers.add(new Member(3, "user03", "pass03", 40, new String[]{"독서", "명상"}, BloodType.O, AccountStatus.ACTIVATE));

            saveMembers(defaultMembers);    // 파일에 작성
        }

        loadMembers();  // 회원 목록 읽어오기

    }

    /* 설명. 파일로부터 회우너 객체들을 읽어와서 memberList 컬렉션에 저장*/
    private void loadMembers() {
        // 파일이 존재할 경우
        // try-with-resource : try문 괄호()에 구현하면 finally문 생성하지 않아도 됨
        try(ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(file)
                ))) {
            while(true) {
                memberList.add((Member)ois.readObject());   // Object -> Member 로 다운캐스팅
            }
        } catch(EOFException e) {
            System.out.println("회원 정보 다 읽어줘.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* 설명. ArrayList<Member> 를 받으면 파일로 출력하는 메소드(feat. 덮어씌우는 기능) */
    private void saveMembers(ArrayList<Member> inputMembers) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream((file))
                    )
            );
            for(Member member : inputMembers) {
                oos.writeObject(member);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                if(oos != null) {oos.close(); }
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ArrayList<Member> selectAllMembers() {
        return memberList;
    }

    public Member selectMemberBy(int memNo) {
        Member returnMember = null;
        for(Member member : memberList) {
            if(member.getMemNo() == memNo) {
                returnMember = member;
            }
        }
        return returnMember;
    }

    // 설명. 마지막 회원 번호를 알려주는 함수
    public int selectLastMemberNo() {
        Member lastMember = memberList.get(memberList.size() - 1);
        return lastMember.getMemNo();
    }

    //  설명. 기존 회원 목록 DB에 추가하는 메서드
    public int insertMember(Member member) {
        // 스트림을 오버라이딩 해서 회원 추가는 헤더 없이 덧붙여지도록 해야 한다.
        /* 설명. 헤더가 추가되지 않는 ObjectOutputStream 클래스 정의(MyObjectOutputStream) */
        MyObjectOutput moo = null;

        int result = 0;

        try {
            moo = new MyObjectOutput(
                    new BufferedOutputStream(
                            new FileOutputStream(file, true)
                    )
            );
            /* 설명. 파일로 신규 회원 추가하기 */
            moo.writeObject(member);

            /* 설명. 컬렉션에도 신규 회원 추가하기
                (MyObjectOutputStream으로 이어붙인 정보는 다시 입력 받아도 이전 파일로 인식함)
                (프로그램을 껐다 켜면 다시 재인식이 되긴 함.)*/
            memberList.add(member);

            result = 1; // 성공 (멤버 1개를 INSERT함.)
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(moo != null) moo.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return result; // 성공(1), 실패(0)

    }

    /* 설명. 수정은 사본이 넘어오면 컬렉션에 담긴 동일한 회원을 udpate하고
    *   컬렉션의 회원정보로 파일을 덮어씌운다. */
    public int updateMember(Member reformMember) {
        for(int i=0; i<memberList.size(); i++) {
            if(memberList.get(i).getMemNo() == reformMember.getMemNo()){
                memberList.set(i, reformMember);  // 컬렉션 업데이트
                saveMembers(memberList);          //파일 업데이트(떺어씌위기)

                return 1;   // 성공
            }
        }
        return 0;       // 실패
    }

    /* 설명. 회원 번호를 전달받아 회원을 삭제하는 메서드
    *       soft delete (일종의 업데이트)를 통해 회원 탈퇴 구현 */
    public int deleteMember(int removeMemNo) {
        // AccountStatus 를 ACTIVATE -> DEACTIVATED 로 변경
        int result = 0;

        for(Member mem : memberList) {
            if(mem.getMemNo() == removeMemNo){
                mem.setAccountStatus(AccountStatus.DEACTIVATED);    // 컬렉션만 업데이트된 것

                result = 1;
                saveMembers(memberList);     // DB에도 업데이트(그냥 수정된 컬렉션으로 덮어씌우기)
            }
        }
        return result;
    }








}
