package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

/* 설명. BooKDTO에 대해 추가적인 정렬 기준(가격 오름차순)을 위한 클래스 */

/* 필기.
    차이점 더 자세히 공부 필요
    오름차순, 내림차순 이외의 다른 정렬을 위해 정의해서 사용하는 것
    클래스 바깥에서 정의 가능
    compareTo() 보다 유지보수가 더 쉽다.  */
public class AscendingPrice implements Comparator<BookDTO> {
    // Comparator 인터페이스를 구현한 AscendingPrice 클래스
    // 가격 기준 오름차순 정렬
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getPrice() - o2.getPrice();   //필기. 순서대로 하면 오름차순 .... 여기 공부 더 핑료함.
    }

    /* 설명.Comparator의 제네릭 타입을 작성하지 않느다면 -> 추가 다운캐스팅을 해 주어야 한다. */
//    @Override
//    public int compare(Object o1, Object o2) {
//        return ((BOOKDTO)o1).getPrice() - ((BookDTO)o2).getPrice();
//    }




}
