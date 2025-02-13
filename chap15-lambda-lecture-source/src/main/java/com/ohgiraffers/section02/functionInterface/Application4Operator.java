package com.ohgiraffers.section02.functionInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4Operator {
    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Operator 에 대해 이해하고 사용할 수 있다. */
        // 필기. UnaryOperator : 매개변수가 1개
        //      제네릭에 타입 1개 -> 매개변수와 반환형의 타입이 같다. ?
        UnaryOperator<String> unaryOperator = str -> str + "World!";
        System.out.println(unaryOperator.apply("Hello"));

        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("Nice to", "meet u!"));


    }
}
