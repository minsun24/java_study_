package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    
    // if문
    public void testSimpleIfElseStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요. ");

        /* 설명. 정수를 하나 입력받아 양수와 음수를 구분하고 양수일 경우에만 짝수/홀수를 판별한다. */
        int input = sc.nextInt();

        // <의사코드>
        // 만약에 홀수라면 '입력하신 정수는 홀수입니다.' 출력
        // 홀수가 아니라면 '짝수입니다.' 출력
        if(input % 2 != 0){
            System.out.println("입력하신 정수는 홀수입니다. ");
        }else{
            System.out.println("입력하신 정수는 짝수입니다. ");
        }

    }
    
    // 중첩 if문
    public void testNestedIfElseStatement() {
        System.out.println("정수를 하나 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input >= 0){
            if(input % 2 == 0){
                System.out.println("양수이면서 짝수입니다. ");
            }else{
                System.out.println("양수이면서 홀수입니다. ");
            }
        }else{
            System.out.println("음수입니다. ");
        }
    }


}
