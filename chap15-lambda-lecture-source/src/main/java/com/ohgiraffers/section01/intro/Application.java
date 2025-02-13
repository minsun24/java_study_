package com.ohgiraffers.section01.intro;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 람다식에 대해 이해하고 활용할 수 있다.
            (feat. Functional Interface -> ) */

        /* 목차. 1. (기명) 인터페이스를 구현하는 클래스로 하위 구현체를 만드는 방법 ( feat. 자식 클래스 필요 )  */
//        Calculator cal = new Calculator() ; interface라 객체 x
        Calculator cal = new CalculatorImpl(); // interface의 하위 구현체를 만들어 객체생성해야 한다.

        System.out.println("10과 20의 합은? " + cal.sumTwoNumbers(10, 20));     // 동적 바인딩 발생



        /* 목차. 2. (익명) 익명 클래스를 활용하는 방식 (인터페이스만으로 하위 구현체 생성 - 다른 타입 필요 X, 인터페이스만으로 생성 가능? )
        *           (자식(구현) 클래스 없애기) */
        Calculator cal2 = new Calculator() {
            // ----------------------------------------------------
            @Override
            public int sumTwoNumbers(int first, int second) {
                return first + second;
            }
        };      // (이름이 없는) 익명 클래스 부분 ---------------------

        System.out.println("10과 20의 합은<익명 클래스>? :  " + cal2.sumTwoNumbers(20, 30));     // 50
        // 익명 클래스 부분이 실행되어 출력된다.



        /* 목차. 3. 람다식을 활용한 방식 (메소드 이름 없애기) */
        /* 설명.
        *   람다식은 익명함수로 이름을 별도로 작성하지 않지만, 인터페이스의 하위 구현체를 생성하며
        *   유일하게 있는 추상 메서드를 오버라이딩하는 개념이기 때문에, 익명 함수가 가능하다.
        *   즉, 람다식을 활용하기 위한 인터페이스는 추상 메서드를 단 하나만 가져야 한다.
        *   그런 인터페이스를 Functional Interface 라고 한다.
        *
        *   설명.
        *    기본 람다식 규칙
        *       1. 매개변수의 소괄호(())는 생략할 수 없지만 매개변수가 하나인 추상 메소드는 소괄호도 생략 가능하다.
        *           (ex. x -> 1 + x);
        *       2. 구현하는 메서드의 바디 부분에서 실행 구문이 하나일 경우, 중괄호({}) 가 생략 가능하다.
        *       3. 실행될 마지막 구문이 리터럴 형태로 끝나고 추상 메소드에 반환형이 있을 경우, return이 생략 가능하다.

        * */
//        Calculator cal3 = (int first, int second) -> {return first + second;};
        Calculator cal3 = (first, second) -> first + second;    // return이 생략됨
        /* 필기.
            표현식 (=리터럴 값 하나가 나오게 하는 식)
            생략 가능한 것 (return, {} 중괄호, 내부 (;) 세미콜론)
        */
        // 필기. 람다식 코드가 두 줄 이상인 경우 중괄호 생략은 불가
        Calculator cal4 = (int first, int second) -> {
            int third = first * 2;
            return third + second;
        };


        System.out.println("2와 4의 합은<람다식>? :  " + cal3.sumTwoNumbers(2, 4));    //  6



    }
}
