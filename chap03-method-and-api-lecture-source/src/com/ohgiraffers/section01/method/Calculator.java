package com.ohgiraffers.section01.method;

public class Calculator {
    // non-static method
    // 두 수를 더하는 함수
    public int plusTwoNumbers(int first, int second) {
       return(first + second);
    }
    // 두 수 중 작은 값 출력하는 함수
    public int minNumberOf(int first, int second) {
        return (first > second) ? second : first;
    }
    // 두 수 중 큰 값 출력하는 함수
    public static int maxNumberOf(int first, int second) {
        return (first > second) ? first : second;
    }


}
