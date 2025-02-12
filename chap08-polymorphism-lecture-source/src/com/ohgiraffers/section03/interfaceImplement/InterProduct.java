package com.ohgiraffers.section03.interfaceImplement;

public interface InterProduct extends ParentInterProduct, AnotherParentInterProdduct {

//    public static final int MAX_NUM = 100;  // final 키워드는 변수명이 주로 대문자로 구성, 선언 및 초기화 필요
    int MAX_NUM = 100;      // 상품이 최대 100개만 저장 가능하고 변동 없이 이 값을 활용해라.

    /* 설명. 인터페이스는 생성자를 가질 수 없다. (feat. 객체를 만들 수 없음) */
//    public InterProduct(){}

//    public abstract void nonStaticMethod(); // 추상 메소드, abstract 키워드 생략해도 자동 생성해줌.



    // 아래 내용은 참고할 것 !!!
    /* 설명. static 메소드를 사용하면 메소드의 바디부까지 작성이 가능하다. (JDK 1.8 부터 추가) */
    public static void staticMethod(){

    }

    /* 설명. non-static 메소드도 default 키워드를 사용하면 메소드의 바디부까지 작성이 가능하다. (JDK 1.8부터 추가) */
    public default void defaultMethod(){

    }

    /* 설명. 접근 제어자가 private인 메소드는 메소드의 바디부까지 작성이 가능하다. (feat. default도 없이) */
    private void privateMethod() {

    }

    // ("구현한"??) 인터페이스의 추상 메소드를 오버라이딩
    void nonStaticMethod();
}
