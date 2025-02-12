package com.ohgiraffers.section08.uses;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MemberService manager = new MemberService();

        while(true){
            System.out.println("===== 회원 관리 프로그램 =====");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료 ");

            System.out.print("메뉴를 골라주세요. : ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    manager.signUpMembers();    // 5명의 회원 회원 가입 등록
                    break;
                case 2:
                    manager.showAllMembers();
                    break;
                    // ===== 가입된 회원 목록 =====
                    //[Member{num=1, id='user01', pwd='pass01', name='홍길동', age=20, gender=M}, Member{num=2, id='user02', pwd='pass02', name='유관순', age=16, gender=F}, Member{num=3, id='user03', pwd='pass03', name='신사임당', age=35, gender=F}, Member{num=4, id='user04', pwd='pass04', name='윤봉길', age=23, gender=M}, Member{num=5, id='user05', pwd='pass05', name='한석봉', age=45, gender=M}
                    // , null, null, nul ...
                case 9:
                    System.out.println("프로그램을 종료하겠습니다. ");
                    return; // 프로그램 종료
//                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다. ");
            }
        }
    }
}


