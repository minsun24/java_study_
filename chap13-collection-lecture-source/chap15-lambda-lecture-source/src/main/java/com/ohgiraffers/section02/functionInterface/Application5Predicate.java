package com.ohgiraffers.section02.functionInterface;

import java.util.function.Predicate;

public class Application5Predicate {
    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Predicate에 대해 이해하고 사용할 수 있다.  */
        // 반환형이 Boolean으로 정해져있다.
        // 매개변수는 제네릭 (여기서는 Object로 받고 있음)
        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println("문자열인지 확인: " + predicate.test("Hello World"));   // true
        System.out.println("문자열인지 확인: " + predicate.test(123));     // false

        // 필기.  value instanceof Type : value가 해당 Type인지 반환 true/false
    }
}
