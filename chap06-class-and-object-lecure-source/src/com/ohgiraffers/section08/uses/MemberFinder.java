package com.ohgiraffers.section08.uses;

public class MemberFinder {

    /* 설명. 1차원 회원 배열을 반환해주는 메소드 */
    public Member[] findAllMembers() {
//        System.out.println("등록된 회원 목록입니다. ");
        return MemberRepository.findAllMembers();
    }
}
