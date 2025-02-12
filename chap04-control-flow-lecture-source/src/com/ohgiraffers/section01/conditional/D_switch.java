package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    /* 설명. switch문 흐름 확인용 메소드 */
    public static void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("등급을 입력하세요(G, S, B): ");
        char grade = sc.next().charAt(0);   // 메소드 chaining
        // sc.next() : String 으로 받아옴. 문자열은 인덱스로 접근 가능

        System.out.println("grade = " + grade);

        int point = 0;
        /* 설명. ture/false 상황을 저장해서 나중에 활용할 용도로 flag변수 추ㅏ*/
        boolean flag = true;

        switch(grade){
            case 'G':
                point +=10 ;
            case 'S':
                point +=10 ;
            case 'B':
                point +=10 ;
                break;

            default:
                flag = false;
                System.out.println("입력 좀 똑바로;;;");
        }
        /* 설명. if를 할용한 조건문에서 실행 구분이 하나라면 중괄호({}) 를 생략할 수  있따. */
        if(flag == true){
            System.out.println("당신의 등급은" + grade + "이고, 현재 포인트는 "+ point + "입니다. ");
        }else{
            System.out.println("등급도 모르는 거 같으니 이참에 회원가입 ㄱㄱ");
        }

    }
}
