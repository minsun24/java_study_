package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {


    public void testSimpledForStatement() {

//            ~동안(1부터;10까지;1씩 증가){
//                ... 1부터 10까지 반복하며 출력
//             }
        for(int i=0; i<=10; i++){
            System.out.println("i = " + i);
        }
    }

    public void testForExample() {

        /* 설명. 각 변수들에 담겨있는 값들에 2를 곱하고 1을 더하여 sum에 누적하자. */
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;

        int sum = 0;

        sum += num1 * 2 + 1;
        sum += num2 * 2 + 1;
        sum += num3 * 2 + 1;
        sum += num4 * 2 + 1;
        sum += num5 * 2 + 1;

        System.out.println("sum = " + sum);

        /* 설명. for문을 통해 개선해보자. (∵ 규칙적이며 반복적인 코드들) */
        int forSum = 0;

        for (int i = 0; i < 5; i++) {
            forSum += (i + 1) * 2 + 1;
        }
        System.out.println("forSum = " + forSum);
    }

    public void testForExample2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("limit 값을 입력해주세요 : ");
        
        int limit = sc.nextInt();
        
        int sum = 0;

        // for(int i=0; ; ) => 무한반복 for문

        for (int i = 1; i <= limit; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
