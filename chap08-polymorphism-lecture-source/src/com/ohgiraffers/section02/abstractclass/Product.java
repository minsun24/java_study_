package com.ohgiraffers.section02.abstractclass;

/* 설명. abstract 키워드 (예약어)
*    => 객체를 생성하지 못하는 불완전한 클래스라는 뜻
*   클래스 내부에 추상 메소드가 0개 이상 존재할 경우,
*   불완전하다고 볼 수 있으므로, 무조건 추상 클래스로 정의해주어야 한다.
*   추상 클래스는 자식 클래스에게 "규약"을 준다.
*   라이브러리에서 많이 사용 ... (참고 - ArrayList....)
* */

public  abstract class Product {
    private int nonStaticField;
    private static int staticField;

    public Product() {
    }

    public void nonStaticMethod(){}

    public void staticMethod(){}

    /* 설명. 추상(abstract) 메서드
    *     추상 메서드가 하나라도 있다면, 해당 클래스는 추상 클래스가 되어야 한다.
    *     & 자식은 부모의 추상메서드를 오버라이딩 해줘야 함.
    * */
    public abstract void abstractMethod();  // body 부{} 가 없음

}
