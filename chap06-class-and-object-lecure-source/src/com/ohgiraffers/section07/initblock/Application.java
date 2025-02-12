package com.ohgiraffers.section07.initblock;

public class Application {
    // 프로그램 시작과 함께 static 변수인 brand가 생성됨.
    public static void main(String[] args) {
        Product product = new Product();
        // 인스턴스 변수 생성됨(name, price)
        System.out.println(product.toString());
        /*
            초기화 블록 실행 ...
            Product 기본 생성자 호출
            Product{name= '샤오미', price=170, brand='삼성'}
         */



    }

}
