package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {

        /* 수업목표. 변환값이 있는 메서드를 작성할 수 있다. */
        String result = testMethod();
        System.out.println("result = " + result);

        /* 설명. 메서드의 반환값을 한번만 쓸 거라면 굳이 변수에 담지 않아도 된다. */
        // 메서드 먼저 실행됨!
        System.out.println("testMethod() = " + testMethod());

    }

    /* 설명. 반환값 => String */
    private static String testMethod() {
        System.out.println("testMethod 메서드 실행됨 ... ");
        return "test";
    }
}
