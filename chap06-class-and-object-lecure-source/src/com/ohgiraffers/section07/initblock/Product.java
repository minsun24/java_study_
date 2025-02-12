package com.ohgiraffers.section07.initblock;

public class Product {
    private String name = "아이폰";      // 상품명
    private int price;                  // 상품 단가
    private static String brand;        // 제조사

    /* 설명. 초기화 블록은 생성자 이전에 실행되며,
    *       어떤 생성자로 객체를 생성하든  공통적인 로직이 있다면 작성
    * */
    /* 설명. 순서 정리
            객체가 생성되면!
               0. static 변수 생성 (static 메모리에 할당)
               1. 인스턴스 변수 생성 (메모리에 할당)
               --- null값, 0 ---
        *      2. static 초기화 블럭 (정적 초기화 블럭)
        *      3. 그냥 초기화 블럭 (인스턴스 초기화 블럭)
        *      4. 생성자
        *
    */
    {
        System.out.println("초기화 블록 실행 ...");
        price = 170;
        Product.brand = "삼성";
    }

    static {
//        price = 200;    // static 초기화 블럭에서는  인스턴스 변수에 접근이 불가능하다.
        Product.brand = "엘지";
    }

    // 생성자 전달받을 수 있는 매개변수가 2개밖에 없는 이유?
    // static 변수는 생성자의 매개변수로 전달받을 수 없음?!
    public Product() {
        System.out.println("Product 기본 생성자 호출");
        name= "샤오미";
    }

    public Product(String name){
        this.name = name;
    }
    public Product(int price){
        this.price = price;
    }


    @Override
    public String toString(){
        return "Product{" +
                "name= '" + name + '\'' +
                ", price=" + price +
                ", brand='" + Product.brand + '\'' +       // static 변수라, 이탤릭체
                '}';
    }
}
