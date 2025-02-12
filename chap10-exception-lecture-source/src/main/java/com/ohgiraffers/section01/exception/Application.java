package com.ohgiraffers.section01.exception;


public class Application {
    public static void main(String[] args) {

        /* 수업목표. 예외에 대해 이해하고, 이를 처리하기 위한 문법을 활용할 수 있다. */
        /* 설명.
        *   1. throws 를 통한 위임 (예외 감지하면 던져줌)
        *   2. try-catch 를 통한 처리
        * */

        ExceptionTest et = new ExceptionTest();

        /* 목차. 1. throws로 처리 시 */
//        et.checkEnoughMoney(50000, 10000);
        // 따로 예외 처리 클래스 만들지 않고, 메인에 throws ArithmeticException 처리해주면
        // 예외 객체가 JVM에게 날라간다.


//        /* 목차. 2. try-catch 블럭 */
//        /* 설명. try 블럭
//            - 예외를 감지할 부분 -> 너무 큰 범위일 경우, 여러 개의 예외 처리가 한 범위에 있어서, 제대로 처리되지 않을 수 있음....
//            - 트랜잭션의 성질 : 순서대로 실행 , 예외가 발생한 시점에 -> catch로 던져짐(throws)
//        */
//        try{
            /* 설명. try 블럭은 처리 할 예외가 발생할 적당한 범위를 감싼다. */
//            et.checkEnoughMoney(10000, 50000);
//            et.checkEnoughMoney(50000, 10000);
//            System.out.println("예외가 없었군요. 돈이 많으신가봐요 ? ");   // 예외가 발생하지 않을 경우 출력됨.
//
//        /* 설명. catch 블럭
//            - try블럭에서 발생한 예외(객체)를 처리하는 부분
//            - 예외 객체를 활용하게 되면 해당 예외 객체를 사용할 수 있다.
//        * */
//        }catch(ArithmeticException e){
//            System.out.println("예외가 발생했군요!");
//
//            System.out.println("그 예외는 " + e.getMessage() + "때문이군요! ");
//            /* 설명. 예외.getMessage()
//            *   throwable 클래스의 detailmessage를 반환하는 메서드
//            *   detailmessage는 throwable의 필드 중 하나.
//            *  */
//            System.out.println("거 돈 좀 넉넉히 들고 다닙시다. ");
//
//            /* 설명. 예외 메시지와 발생한 문제들을 추적할 수 있게 빨간 글씨의 메시지로 처리되는 방식 */
//            e.printStackTrace();    // stack 영역을 추적?
//            // 흔히 보는 빨간색 에러. 문구가 보임
//            // 우리가 보는 에러들, e.printStackTrace()로 처리되어 있던 것.!
//
////            System.exit(0);     // 자바 애플리케이션이 이 시점에 종료되도록
//        }

        /* 목차. 3. 0을 나누는 불능의 상태를 처리해보자.  */
        /* 설명. 다형성의 이유로 상위 버전을 캐치해줄 때,
                ArithmeticException을 Exception이라 칭해도 무방하다.
        *       유지 보수 측면에서 다른 것을 발생시킬수 있기 때문
        *       두 가지 Exception이 발생할 수 있기 때문
        *       두 가지 예외가 발생할 수 있는 상황에서 가능하기 때문에
        *       throw ArithmenticException, NullPointException 이라고 지정할수 있음.*/
        try{
            int num = 10;
            System.out.println(num / 0);
        }catch(ArithmeticException e){
            System.out.println("잘 좀 나누자 ~ 0이 뭐니~ ");
            System.out.println(e.getMessage()  + "라잖아~ ! ");
        }


        System.out.println("프로그램을 종료합니다. ");
    }
}





