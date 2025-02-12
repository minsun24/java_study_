package com.ohgiraffers.section08.uses;

import java.util.Arrays;

// 매니저
public class MemberService {
    // 회원가입을 잘 시키는 객체에게 위임 (???)

    /* 설명. 5명의 회원을 한 번에 등록(= 저장)하는 상황
            회원가입용 객체의 메소드를 호출(전달 인자를 전달하며)
    *   */
    public void signUpMembers() {
        Member[] members = new Member[5];
        members[0] = new Member(1, "user01", "pass01", "홍길동", 20, 'M');
        members[1] = new Member(2, "user02", "pass02", "유관순", 16, 'F');
        members[2] = new Member(3, "user03", "pass03", "신사임당", 35, 'F');
        members[3] = new Member(4, "user04", "pass04", "윤봉길", 23, 'M');
        members[4] = new Member(5, "user05", "pass05", "한석봉", 45, 'M');

        MemberRegister register = new MemberRegister();
        register.regist(members);



    }
    /* 설명. 회원 전체 조회 메소드 */
    public void showAllMembers() {
        MemberFinder finder = new MemberFinder();
        System.out.println("===== 가입된 회원 목록 =====");
        Member[] returnMembers = finder.findAllMembers();

        // 배열 내용 출력
        for(Member m : returnMembers){
            if(m == null){
                break;
            }
            System.out.println(m);
        }
//        System.out.println(Arrays.toString(finder.findAllMembers()));

    }
}
