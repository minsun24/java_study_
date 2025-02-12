package com.ohgiraffers.section01.exception;

public class ExceptionTest {
    // 메서드 헤드 부분에 throws ..Exception 명시해주는 이유
    // -> 생략해도 가능하지만, 메서드를 사용할 때 던져지는 예외객체를 알려주지 않음
    // => 개발자 편의 위해 작성해줌.
    public void checkEnoughMoney(int price, int money) throws ArithmeticException{
        System.out.println("가지고 계신 돈은 " + money + "원 입니다. ");

        if(money >= price){
            System.out.println(price + "원 상품을 구입하기 위한 금액이 충분합니다. ");
            return;
        }
//        System.out.println("호주머니 사정이 딱하군요!" );

        /* 설명. 예외 상황에 Exception을 상속 받는 클래스와 객체를 생성하고 throw로 발생 */
        throw new ArithmeticException("호주머니 사정이 딱하군요!");

    }
}
