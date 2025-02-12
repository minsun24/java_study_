package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. 여러 개의 전달 인자를 이용한 메소들 호출을 할 수 있다. */

        Application4 app4 = new Application4(); // 클래스 인지

        String name = "정민선";
        int age = 23;
        char gender = '여';

        app4.testMethod(name, age,gender);
    }

    /* 설명. 이름, 나이, 성별을 출력해주는 함수 */
    public void testMethod(String name, int age, final char gender) {
        // 매개변수 name, age, gender는 지역변수 ~
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세이며, 성별은 " + gender + "입니다. " );
    }
}








