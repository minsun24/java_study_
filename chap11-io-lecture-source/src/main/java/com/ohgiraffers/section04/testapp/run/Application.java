package com.ohgiraffers.section04.testapp.run;

import com.ohgiraffers.section04.testapp.aggregate.BloodType;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.service.MemberService;

import java.sql.SQLOutput;
import java.util.Scanner;

/* 설명. 프론트엔드 부분 담당 RUN & VIEW */
public class Application {
    private static final MemberService ms = new MemberService();
    /* 필기. static 이어야 한다.
        final인 이유? -> 멤버 서비스 객체는 단 한 개 생성 후 공유해서 사용 (고정)
        final이 아닌 경우, 요청할 때마다 불필요한 멤버서비스 객체가 생성됨.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("======== 회원 관리 프로그램 ========");
            System.out.println("1. 모든 회원 정보 보기");
            System.out.println("2. 회원 찾기");
            System.out.println("3. 회원 가입");
            System.out.println("4. 회원 정보 수정 ");
            System.out.println("5. 회원 탈퇴");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴를 선택해 주세요: ");
            int choice = sc.nextInt();


            switch(choice){
                case 1:
                    ms.findAllMembers();
                    /*  필기
                         초기 실행 : findAllMembers() -> MemberRepository.selectAllMembers() 사용하기 전 
                          -> MemberRepository 파이널 객체가 생성되면서, db 파일이 생성됨
                         초기 실행 x :
                     */
                    break;
                case 2:
                    ms.findMemberBy(chooseMemberNo());
                    break;
                case 3:   // 회원가입
                    ms.registMember(signUp());
                    break;
                case 4: // 회원 정보 수정
                    // 수정할 대상 찾고 // 수정 메서드로 넘기기
                    Member selected = ms.findMemberForMod(chooseMemberNo());
                    if(selected == null) continue;
                    ms.modifyMember(reform(selected));
                    break;
                case 5: ms.removeMember(chooseMemberNo()); break;
                case 9:
                    System.out.println("회원관리 프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
            }

        }
    }

    /* 설명. 회원 수정 페이지 */
    private static Member reform(Member modifyMember) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("===== 회원 정보 수정 서브 메뉴 =====");
            System.out.println("1. 패스워드");
            System.out.println("2. 나이");
            System.out.println("3. 취미");
            System.out.println("4. 혈액형");
            System.out.println("9. 메인 메뉴로 돌아가기");
            System.out.println("내용을 선택하세요: ");
            int chooseNo = sc.nextInt();
            sc.nextLine();  // 버퍼 엔터 제거용
            switch(chooseNo){
                case 1:
                    System.out.println("수정할 패스워드를 입력하세요.");
                    modifyMember.setPwd(sc.nextLine());
                    break;
                case 2:
                    System.out.println("수정할 나이를 입력하세요.");
                    modifyMember.setAge(sc.nextInt());
                    break;
                case 3:
                    System.out.println("수정할 취미를 입력하세요.");
                    modifyMember.setHobbies(resetHobbies()); // 배열은 단순 Scanner로 입력할 수 없음
                    break;
                case 4:
                    System.out.println("수정할 혈액형을 입력하세요");
                    modifyMember.setBloodType(resetBloodType()); // enum은 단순 Scanner로 입력할 수 X
                    break;
                case 9:
                    System.out.println("메인 메뉴로 돌아갑니다. ");
                    return modifyMember;
                default:
                    System.out.println("번호를 다시 제대로 입력해 주세요. ");
                    
            }
        }
    }

    private static BloodType resetBloodType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 혈액형을 입력하세요. (A, AB, B, O)");
        String bloodType = sc.nextLine().toUpperCase();
        BloodType bt = null;
        switch(bloodType){
            case "A": bt = BloodType.A; break;
            case "AB": bt = BloodType.AB; break;
            case "B": bt = BloodType.B; break;
            case "O": bt = BloodType.O; break;
        }
        return null;
    }

    /* 설명. 수정할 취미 리스트 입력받기 */
    private static String[] resetHobbies() {
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 취미의 갯수를 입력하세요(1개 이상) ");
        int length = sc.nextInt();

        String[] hobbies = new String[length];
        for(int i=0; i<hobbies.length; i++){
            System.out.print(i + "번째 취미를 입력하세요: ");
            String input = sc.nextLine();
            hobbies[i] = input;
        }
        return null;
    }

    /* 설명. 회원가입 페이지 */
    private static Member signUp() {
        Member member = null;   // 멤버 객체 생성
        // 멤버 객체에 정보 채우기
        Scanner sc = new Scanner(System.in);
        
        System.out.print("아이디를 입력하세요: ");
        String id = sc.nextLine();

        System.out.print("패스워드를 입력하세요: ");
        String pwd = sc.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        System.out.print("입력할 취미의 개수를 입력하세요(숫자는 1 이상): ");
        int lenght = sc.nextInt();

        // nextLine 안 쓰다가 쓰게 되면, 그냥 지나가게 됨...(?) 이거 CRLF
        sc.nextLine(); // 버퍼에 남아있는 엔터 제거용

        String[] hobbies = new String[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.print(i + "번째 취미를 입력하세요: ");
            String input = sc.nextLine();
            hobbies[i] = input;
            // hobbies[i] = sc.nextLine();
        }

        System.out.println("혈액형을 입력해주세요(A, B, O, AB): ");
        String bloodType = sc.nextLine().toUpperCase();
//        BloodType type = BloodType.valueOf(bloodType); => 이건뭐지? 공부할 것
        // 입력받을 때는 enum 타입으로 받아오지 못하므로
        // 먼저 입력 받을 후 타입을 변환해주어야 한다.
        BloodType bt = null;
        switch (bloodType) {
            case "A": bt = BloodType.A; break;
            case "AB": bt = BloodType.AB; break;
            case "B": bt = BloodType.B; break;
            case "O": bt = BloodType.O; break;
        }

        member = new Member(id, pwd, age, hobbies, bt);

        return member;
    }

    //* 설명. 회원 번호를 입력 받아 int로 변환하는 메서드 */
    private static int chooseMemberNo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("회원 번호를 입력하세요 : ");
        int num = sc.nextInt();
        return num;
    }

}

