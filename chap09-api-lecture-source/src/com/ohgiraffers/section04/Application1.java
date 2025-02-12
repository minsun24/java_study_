package com.ohgiraffers.section04;

public class Application1 {
    public static void main(String[] args) {
        // 기본 타입 unboxing
        // <=> boxing 래퍼 클래스(기능을 가질 수 있게 됨)

        // Integer, Character 의 경우 기본타입과 이름이 다르기 때문에 주의
        
        /* 수업목표. Wrapper 클래스에 대해 이해할 수 있다. */

        int intValue = 20;

        /* 설명. 기본자료형을 Wrapper 클래스 자료형으로 변환할 수 있다. (빅싱, boxing) */
        Integer autoBoxingInt = 20;
        Integer boxingInt2= Integer.valueOf(intValue);

        /* 설명. Wrapper 클래스 자료형을 기본 자료형으로 변환할 수 있다. (언박싱, unboxing) */
        int autoUnBoxingInt = autoBoxingInt;
        int unboxingInt = boxingInt2.intValue();

        anythingMethod(20); 
        // Object(객체) 를 받는 함수,
        // int(정수형)을 주소로 넘겨주는 방법은?
        // int형으로 매개변수를 주면, int(기본형) -> (오토박싱) -> Integer(객체)로 자동 변환되어 함수에서 사용 가능

        /* 설명. Wrapper 클래스 주소값 비교 */
        Integer integerTest = 30;
        Integer integerTest2 = 30;
        System.out.println("equals() 비교: " + integerTest.equals(integerTest2));
        System.out.println("== 비교: " + (integerTest == integerTest2));
        System.out.println("integerTest 주소 : " + System.identityHashCode(integerTest));

        /* 설명. 모든 Wrapper 클래스들도 constant pool 을 활용해 동등 객체는 하나만(동일 인스턴스로) 저장한다. */
        System.out.println("integerTest2 주소 : " + System.identityHashCode(integerTest2));

    }

    // 매개변수를 Object 타입으로 받으면, 모든 객체를 받을 수 있음.
    private static void anythingMethod(Object obj){

        /* 설명. int -> (오토박싱) -> Integer -> Object (다형성) */
        /* 설명. 출력 -> Ojbect의 toString()에서 Integer의 toString()(동적바인딩)이 실행됨 */
        System.out.println("obj : " + obj.toString());
    }

}
