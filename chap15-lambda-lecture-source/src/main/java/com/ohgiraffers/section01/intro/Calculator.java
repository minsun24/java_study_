package com.ohgiraffers.section01.intro;

/* 설명. Functional Interface만 람다식으로 적용 가능하다. */
@FunctionalInterface    // 추상메서드 2개 이상 못 가지게
public interface Calculator {
    int sumTwoNumbers(int first, int second);
//    void test(); => 추상메서드 2개 이상 가질 수 없음.



}
