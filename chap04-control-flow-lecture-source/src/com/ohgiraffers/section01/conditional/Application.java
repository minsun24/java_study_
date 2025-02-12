package com.ohgiraffers.section01.conditional;

// 실행
public class Application {
    public static void main(String[] args) {
        // non-static메서드라 클래스 객체 생성해주어야 함.

        A_if aClass = new A_if();       // A_if 클래스 객체 생성

        /* 설명. 단독 if문 흐름 확인용 메소드 호출 */
//        aClass.testSimpleIfStatement();

        /* 설명. 중첩 if문 흐름 확인용 메소드 호출 */
//        aClass.testNestedStatement();

        B_ifElse bClass = new B_ifElse();

        /* 설명. 단독 if-else문 흐름 확인용 메서드 호출 */
//        bClass.testSimpleIfElseStatement();

        /* 설명. 중첩 if-else문 흐름 확인용 메소드 호출 */
//        bClass.testNestedIfElseStatement();

        C_ifElseIf cClass = new C_ifElseIf();
        /* 설명. 단순 if-else문 흐름 확인용 메소드 호출 */
//        cClasgs.testSimpleIfElseIfStatement();

        /* 설명. 중첩 if-esle-if문 흐름 확인용 메소드 호출 */
//        cClass.testNestedIfElseIfStatement();


        /* 설명. static 메소드로 switch문 흐름 확인용 메소드 호출 */
        D_switch.testSimpleSwitchStatement();


    }
}
