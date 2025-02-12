package com.ohgiraffers.section03.interfaceImplement;


import java.io.Serializable;

/* 설명.
    인터페이스 여러 개 사용 가능 (?)
* */



public class Product implements InterProduct, Serializable {
    // ("구현한"??) 인터페이스의 추상 메소드를 오버라이딩
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩 메소드...");
    }
}
