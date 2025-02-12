package com.ohgiraffers.section01.method;

import java.util.Scanner;


// 클래스(class)는 전역 범위
public class Application3 {
    static int global = 10;     // 프로그램 시작 ~ 종료까지 존재, 사용 가능

    // 메서드(method) 안부터 지역 범위
    public static void main(String[] args) {

        /* 수업목표. 메서드 전달인자(argument) 와 매개변수(parameter)에 대해 이해하고,
            메서드 호출 시 활용할 수 있다. */
        /* 설명.
        *   변수를 선언한 위치에 따라 구분할 수도 있다.
        *   1. 지역변수
        *   2. 전역변수
        *   3. 매개변수
        *
        * */

        Application3 app3 = new Application3();     // 클래스를 인지시킴

        Scanner sc = new Scanner(System.in);

        app3.testMethod(23);        // argument(23)을 전달
        app3.testMethod('a');

        System.out.println("전역변수 = " + global);

//        System.out.println("지역변수 = " + local); 에러. 선언 전이라 사용 불가
        int local = 20;
        System.out.println("지역변수 = " + local);
//        System.out.println("global_v = " + global_v);


    }
    // non-static method
    public void testMethod(int age) {   // age라는 parameter로 받아서 사용.
        System.out.println("당신의 나이는 " + age + "세 입니다. ");
    }
}