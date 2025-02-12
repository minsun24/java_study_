package com.ohgiraffers.section02.abstractclass;

// 추상 클래스를 물려 받음 -> 에러. 해결 방법은? 둘 중 하나.
// 1. 자식 클래스도 추상 클래스로 만들거나
// 2. 부모 클래스의 추상 메소드를 오버라이딩하기 (강제성 규약)

public class Phone extends Product{
    public Phone() {
        super(); //
    }

    // 반드시 오버라이딩 해야 하는 메서드
    @Override
    public void abstractMethod() {
        System.out.println("안 빼먹고 오버라이딩 했다!! ");
    }


}
