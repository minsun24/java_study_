package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 값을 직접 연산하여 출력할 수 있다. */
        System.out.println("=========== 정수와 정수의 연산==============");
        System.out.println(123 + 456);      // 덧셈
        System.out.println(123 - 23);       // 뺄셈
        System.out.println(123 * 10);       // 곱셈
        System.out.println(123 / 10);       // 몫
        System.out.println(123 % 10);       // 나머지

        System.out.println("=========== 실수와 실수의 연산==============");
        System.out.println(1.23 + 1.23);     // 덧셈
        System.out.println(1.23 - 0.23);     // 뺄셈
        System.out.println(1.23 * 10.0);     // 곱셈
        System.out.println(1.23 / 10.0);     // 몫
        System.out.println(1.23 % 1.0);      // 0.22999999999999998
        /* 부동소수점 체계
            실수는 정확하지 않고 근사한 값
            ex. 1.23 를 1.23 으로 정확하게 인식하지 못하고, 근사값으로 인식
            -> 실수끼리 나눗셈 같은 연산 시 의도치 않은 값이 도출될 수 있음.
         */
        System.out.println("=========== 정수와 실수의 연산==============");
        System.out.println(123 / 5);        // 24
        System.out.println(123 / 5.0);      // 24.6
        // 실수 > 정수
        // 결과값을 소수점 이하로 알고 싶을 때, 나누는 수 or 나눠지는 수 둘 중 최소 하나는 실수여야 함.

        System.out.println("=========== 문자와 정수의 연산==============");
        System.out.println('a' + 1);
        System.out.println('a' % 2);

        System.out.println("=========== 문자열과 문자열의 연산==============");
        System.out.println("Hello" + "World~");  // concat
//        System.out.println("Hello" - "World");   // 컴파일 에러.
        // concat 을 제외한 나머지 산술연산은 되지 않음.
//       /* 설명. 문자열과 문자열의 연산은 '+'만 가능하며 이어붙이기 효과가 발생한다. */

        System.out.println("=============문자열과 다른 형태의 값 연산 ===============");

        System.out.println("hello" + 123);
        System.out.println("hello" + true);
        System.out.println(123 + 1 + "hello" + 123.0 + 2);
        // 1. 123 + 1 : 정수 연산 (124)
        // 2. 124 + "hello" : 문자열 이어붙이기 (124hello)
        // 3. "124hello" + 123.0 + 1 : 문자열 이어붙이기 (124hello123.02)
        System.out.println(123 + 1 + "hello" + (123.0 + 2));
        // 0. (123.0 + 2) : 실수 연산 (125.0)
        // 1. 123 + 1 : 정수 연산 (124)
        // 2. 124 + "hello" : 문자열 이어붙이기 (124hello)
        // 3. "124hello" + 125.0 : 문자열 이어붙이기 (124hello125.0)
    }
}
