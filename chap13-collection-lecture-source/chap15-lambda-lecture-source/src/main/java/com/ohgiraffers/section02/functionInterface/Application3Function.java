package com.ohgiraffers.section02.functionInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Application3Function {
    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Function 에 대해 이해하고 사용할 수 있다. */

        /*  필기. @@Function : 매개변수, 반환형이 있다. */
        Function<String, Integer> function = str -> Integer.valueOf(str);
        String strValue = "12345";
        System.out.println(function.apply(strValue));   // outupt : 12345
        System.out.println(function.apply(strValue) instanceof  Integer);   // output: true

        BiFunction<String, String, Integer> biFunction =
                (str1, str2) -> Integer.valueOf(str1) + Integer.valueOf(str2);
        System.out.println(biFunction.apply("12345", "11111"));
        // output : 23456

    }
}
