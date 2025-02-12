package com.ohgiraffers.section04.testapp.service;

import com.ohgiraffers.section04.testapp.aggregate.AccountStatus;
import com.ohgiraffers.section04.testapp.aggregate.Member;
import com.ohgiraffers.section04.testapp.repository.MemberRepository;

import java.io.IOException;
import java.util.ArrayList;

/* 설명. 서비스  Service 영역
*       - 트랜잭션 처리 (성공 실패에 따라 commit/rollback -> DB 연동 시)
*       및 회원 관리 비즈니스 로직 처리 */
public class MemberService {

    private final MemberRepository mr = new MemberRepository();

    // 회원 목록 조회
    public void findAllMembers() {
        ArrayList<Member> findMembers = mr.selectAllMembers();      // DB ...

        System.out.println("Service에서 조회 확인: ");
        for (Member member : findMembers) {
            System.out.println(member);
        }
    }

    // 특정 회원 번호로 회원 찾기
    public void findMemberBy(int memNo) {
        Member findMember = mr.selectMemberBy(memNo);

        if(findMember != null) {
            System.out.println("회원 조회 성공: " + findMember);
        } else {
            System.out.println(memNo + "번 회원은 없습니다.");
        }
    }

    public void registMember(Member member) {
        /* 설명. 회원가입 시 입력받은 값 제외 (회원 번호, 활성화 여부) 값을 마저 채워준다. */
        /* 설명. 1. 회원 번호 추가 */
        // MemberRepository에게
        // 전체 회원 목록 크기 SELECT
        // 회원 정보 INSERT
        int lastMemberNo = mr.selectLastMemberNo();
        member.setMemNo(lastMemberNo + 1);

        /* 설명. 2. 회원 활성화 상태 추가 */
        member.setAccountStatus(AccountStatus.ACTIVATE);

        /* 설명. 모든 DML 작업 (INSERT, UPDATE, DELETE)이 일어난 행의 갯수 */
        int result = mr.insertMember(member);
        System.out.println("insert 성공 실패 여부 :" + result);

        if(result == 1){ // 회원가입 성공
            System.out.println("회원가입을 축하드립니다! " + member.getId() + "님! ");
        }else{
            System.out.println("회원가입에 실패하였습니다. ");
        }

    }

    /* 설명. 회원 정보를 수정하는 메서드 */
    public Member findMemberForMod(int memNo) {
        Member selectedMember = mr.selectMemberBy(memNo);   // 회원 번호로 회원 가져오기

        // 회원 번호로 null 이 올 수도 있음을  감안
        if(selectedMember != null) {    // 해당 회원이 조회되었을 때

            /* 설명. 조회된 회원을 그대로 반환해서 수정하면 Repository의 컬렉션에 담긴 객체가 수정된다. */
            /* 설명. 따라서 우리는 사본의 개념을 만들어 Repository의 컬렉션이 오염되지 않도록 할 것이다. */

            /* 필기. 실제 공간에 직접 바로 direct로 수정하지 않고,
                    가져온 객체의 사본을 만들어, 옮겨담은 그 객체를 수정한 다음 공간에 교체(?)하는 방법
                    Service   | Repository
                    사본(수정)     원본
            *    */
            // 사본에 원본 멤버 정보 옮겨심기
            Member newInstance = new Member();

            newInstance.setMemNo(memNo);
            newInstance.setId(selectedMember.getId());
            newInstance.setPwd(selectedMember.getPwd());
            newInstance.setAge(selectedMember.getAge());

            /* 설명. 취미는 배열이고 배열은 깊은 복사를 해 주어야 사본인 회원이 따로 취미 배열을 가지게 된다. */
            String[] copiedHobbies = selectedMember.getHobbies().clone();   // 깊은 복사
//            newInstance.setHobbies(selectedMember.getHobbies());    //
            newInstance.setHobbies(copiedHobbies);
            newInstance.setBloodType(selectedMember.getBloodType());
            newInstance.setAccountStatus(selectedMember.getAccountStatus());

            System.out.println("조회된 회원의 사본은 : " + newInstance);
            return newInstance;

        } else {
            System.out.println("그런 회원은 없네요. ");
        }

        return selectedMember;
    }

    /* 설명. 회원 정보 수정 */
    public void modifyMember(Member reformedMember) {
        int result = mr.updateMember(reformedMember);
        // 0 or 1
        if(result == 1){
            System.out.println(reformedMember.getId() + "회원님의 정보를 수정했습니다! ");
        }else{
            System.out.println("회원 정보 수정 실패");
        }
    }


    public void removeMember(int removeMemNo) {
        int result = mr.deleteMember(removeMemNo);
        if(result == 1){
            System.out.println(removeMemNo +"번 회원님이 삭제되었습니다.");
        }else{
            System.out.println("회원 정보 삭제 실패");
        }
    }
}


