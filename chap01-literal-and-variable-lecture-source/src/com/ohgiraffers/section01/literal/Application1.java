package com.ohgiraffers.section01.literal;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 여러가지 값의 형태를 출력할 수 있다. */
        // JAVA는 정적 타입 언어 - 변수를 선언할 때 반드시 타입을 명시해주어야 함.

        /* 설명.
        *   리터럴은 변하지 않는 데이터 그 자체
        *
        * */
        /* 목차. 1. 숫자 형태의 값 */
        /* 목차. 1-1. 정수 형태의 값 출력  */
        System.out.println(123);

        /* 목차. 1-2. 실수  형태의 값 출력 */
        System.out.println(10.5);

        /* 목차. 2. 문자 형태의 값 출력 */
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000');  // 유니코드로 0번(값이 없는 문자)

        /* 목차. 3. 문자열 형태의 값 출력 */
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println("");

        /* 목차. 4. 논리 형태의 값 출력 */
        System.out.println(false);  // false
//        System.out.println("true");  // 문자형이지, boolean 형이 아님.
        System.out.println(true);   // true

    }
}
