package com.ohgiraffers.section01.object.dto;

import java.util.Objects;

public class BookDTO {
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

    /* 설명. 부모인(Object 클래스)로부터 toString() 을 받아서, 오버라이딩(재정의)한 것 */
    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    /* 설명. 오버라이딩 할 때 equals() 만 단독으로 하면 안됨.
    *       hashcode() 도 함께 오버라이딩 해줘야 함. (???) -> 더 효율적이기 위함.
    *       ex. hashcode로 분류가 같은지 먼저 비교하고, 같으면 equals() 비교 진행, 다르면 그냥 넘어가기(효율적)
    *       hashcode() : 분류가 같은지 비교.
    *       equals() : 값이 같은지 비교
    *
    * */
    // equals() and hashcode() 오버라이딩
    @Override
    public boolean equals(Object o) {       // Object o = DTO 객체 (다형성 때문에 가능한 것)
        if (o == null || getClass() != o.getClass()) return false;
        BookDTO bookDTO = (BookDTO) o;
        return price == bookDTO.price && Objects.equals(title, bookDTO.title) && Objects.equals(author, bookDTO.author);
    }

    // 필드가 같으면 같은 값을 내뱉도록?
    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }
}

