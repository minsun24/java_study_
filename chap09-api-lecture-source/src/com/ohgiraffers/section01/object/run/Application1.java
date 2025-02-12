package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.dto.BookDTO;

public class Application1 {
    public static void main(String[] args) {
        BookDTO book1 = new BookDTO(1, "홍길동전", "허균", 50000);  // 다른 패키지 클래스 -> import 해서 사용해야 함.
        BookDTO book2 = new BookDTO(2, "홍길동전", "허균", 50000);

        /* 설명. '==' 연산자로 비교
        *   동일 비교 (주소값이 같으냐?)
        * */
        System.out.println("두 인스턴스를 == 연산자로 비교 : " + (book1 == book2));  // false

        /* 설명. 'equals()' 로 비교
        *   동등 비교 (값이 같은지) -> 기준을 다르게 재정의해줄 수 있음
        *   ex. 특정 필드가 같으면... 같도록 ...
        * */
        System.out.println("두 인스턴스를 equals()로 비교 : " + book1.equals(book2));  // false 재정의 후 true
        System.out.println("두 인스턴스를 equals()로 비교 : " + book2.equals(book1));  // false 재정의 후 true

        System.out.println("book1의 hashCode: " + book1.hashCode());
        System.out.println("book2의 hashCode: " + book2.hashCode());
        // 원래 다른 객체라, 해시코드가 다르지만(?) => 틀린 설명인듯.
        // 제목, 저자, 가격이 같으면 해시코드 같게 "재정의"했기 때문에, 같은  해시코드가 출력됨.

        /*
            Object 클래스에 정의되어 있는 것
            public boolean equals(Object obj) {
                return (this == obj);
            }
        */

        /* 설명. equals() 재정의 */



    }
}
