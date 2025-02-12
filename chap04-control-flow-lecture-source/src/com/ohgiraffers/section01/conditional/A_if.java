package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

// 모듈
/* 수업목표. if문 개념과 사용법 . */
public class A_if {
    // if문
    public void testSimpleIfStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 한 개를 입력하세요. ");
        int input = sc.nextInt();

        // 만약에 입력받은 값이 짝수이면
        // => "짝수입니다."를 출력
        if(input % 2 == 0) {
            System.out.println("짝수입니다. ");
        }
    }

    // 중첩 if문
    public void testNestedStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("양수 하나를 입력해 주세요: ");
        int input = sc.nextInt();

        if(input > 0) {
            if (input % 2 == 0) {
                System.out.println("입력 받은 값은 양수이면서 짝수입니다. ");
            }else{
                System.out.println("입력받은 값은 양수이면서 홀수입니다. ");
            }
        }

        /* 설명. 중첩 if문만이 정답은 아니다. */
        if(input > 0 && input % 2 == 0) {   //  연산자 우선순위 : 단산시 교비논 삼대
            System.out.println("입력 받은 값은 양수이면서 짝수입니다. ");
        }

    }
}
