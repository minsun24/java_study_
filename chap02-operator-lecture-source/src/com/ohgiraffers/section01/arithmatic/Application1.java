package com.ohgiraffers.section01.arithmatic;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표.  산술연산자에 대해 이해하고 활용할 수 있다. */
        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = "+ (num1 + num2));
        System.out.println("num1 - num2 = "+ (num1 - num2));
        System.out.println("num1 * num2 = "+ (num1 * num2));
        System.out.println("num1 % num2 = "+ (num1 % num2));   // % == mod, modulus


        double testNum = num1 / (double) num2;   // 강제 형변환 => double 형 결과값을 도출하기 위함
        //

        double transNum =(int) (testNum * 100) / (double) 100;  // 소수점 2자리만 남기기 위해
        System.out.println("testNum = " + testNum);
        System.out.println("transNum = " + transNum);

    }
}
