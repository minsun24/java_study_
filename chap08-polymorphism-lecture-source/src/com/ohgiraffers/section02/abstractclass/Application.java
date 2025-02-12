package com.ohgiraffers.section02.abstractclass;

public class Application {
    public static void main(String[] args) {
//        Product p = new Product();
        // 에러.'Product' is abstract; cannot be instantiated
        // => Product가 추상 클래스이므로, 객체 생성해내지 못함.

        Phone smartPhone = new Phone();
        smartPhone.abstractMethod();

        Product smartPhone2 = new Phone();  // 다형성 적용 : Phone -> Product
        smartPhone2.abstractMethod();

//        System.out.println(phone);  // com.ohgiraffers.section02.abstractclass.Phone@3b07d329
//        phone.abstractMethod();  // 안 빼먹고 오버라이딩 했다!!

    }
}
