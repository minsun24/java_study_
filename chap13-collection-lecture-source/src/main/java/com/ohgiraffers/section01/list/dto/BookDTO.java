package com.ohgiraffers.section01.list.dto;

import java.io.Serializable;
import java.util.Objects;

public class BookDTO implements Comparable<BookDTO> {
    private int number;
    private String title;
    private String author;
    private int price;

    public BookDTO() {
    }

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }



    /* 설명.
        우리가 원하는 필드의 오름차순 또는 내림차순을 할 수 있다.
        필드가 n개면 총 (n*2)가지의 정렬 기준을 가질 수 있다. (각각 필드 기준 오름차순, 내림차순)
        -
        정렬은 compareTo() 메소드가 반환하는 int형의 부호에 따라 정해지게 되므로,
    *   오름차순과 내림차순은 부호만 달리 되도록 하면 된다.
    *   (해당 필드가 String 형일 경우에는 String에 정의된 compareTo() 메소드를 활용한다.)
        필기. compareTo 오버라이딩은 필드 한 개를 기준으로만 정렬 가능 .
            => 다른 값을 기준으로 정렬하고 싶다면 / comparator 오버라이딩한 클래스를 생성하여 사용
    * */
    // Comparable 클래스 내부 compareTO 메서드 오버라이드
    // 알고리즘을 별도로 구현할 필요 없음.
    // price 를 기준으로 오름차순 정렬하기(???)
    // ex.  newA().compareTo(new B())


    // sort() 될 때 default 로 사용됨
    @Override
    public int compareTo(BookDTO o) {
        // 필기. compareTo() int 비교
//       /* 설명. 가격에 대한 오름차순 */
//        return this.price - o.price;

        /* 설명. 가격에 대한 내림차순 */
//        return -(this.price - o.price);
//        return (o.price - this.price);

        // 필기. compareTo() String 비교
        /* 설명. 책 제목에 대한 오름차순 */
//        return this.title.compareTo(o.title);
        return o.title.compareTo(this.title);

        /* 설명. 책 제목에 대한 내림차순 */
//        return -this.title.compareTo(o.title);
//        return o.title.compareTo(this.title);
    }

    /*  필기.
    *    compareTo()
    *       두 개의 값을 비교하여 int 값으로 변환해주는 함수
    *       - 문자열의 비교 : 같다(0) | 양수 | 음수
    *       - 숫자의 비교   : 크다(1) | 같다(0) | 작다(-1)
    *
    *  */


    /* 설명. number 제외 3가지 필드가 모두 같으면, 같은 객체로 판단하도록
    *       오버라이딩 */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BookDTO bookDTO = (BookDTO) o;
        return price == bookDTO.price && Objects.equals(title, bookDTO.title) && Objects.equals(author, bookDTO.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }
}
