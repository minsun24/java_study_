package com.ohgiraffers.section08.uses;

public class MemberRegister {

    /* 설명. 회원 목록을 등록하는 메소드 */
    public void regist(Member[] members) {
        System.out.println("회원을 등록합니다. ");

        for(int i=0; i<members.length; i++){
            System.out.println(members[i].getName() + "님, 회원 가입을 축하드립니다. ");
        }
        // DB 역할 - 하나의 저장소를 공유해서 사용 => STATIC 메소드로 !
        MemberRepository.store(members); // DB에 저장
        // 객체 생성 안 하고 클래스로 접근했으므로, 자동으로 STATIC 메서드로 만들어짐.

    }

}
