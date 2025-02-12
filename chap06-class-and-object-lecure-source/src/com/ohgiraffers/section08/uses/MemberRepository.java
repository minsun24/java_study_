package com.ohgiraffers.section08.uses;


/* 설명. DB 역할을 하는 클래스 */
public class MemberRepository {
    private final static Member[] staticMembers = new Member[100];
    // 회원들을 저장하는 객체 배열(DB 테이블 역할) -> 총 100 명의 회원을 등록할 수 있음.
    // fianl 상수, 다른 배열이 덮어쓸 수 없음..? (=> 배열 주소 바뀔 수 없다.)

    private static int count;       // 현재 저장된 회원의 수 - 1 (index)

    // DB에 저장
    public static void store(Member[] members) {
        for(int i=0; i<members.length; i++){
            staticMembers[count ++] = members[i];
            // 1. staticMembers[count] = members[i];
            // 2. count 1 증가
        }
    }

    public static Member[] findAllMembers() {
        return staticMembers;
    }
}
