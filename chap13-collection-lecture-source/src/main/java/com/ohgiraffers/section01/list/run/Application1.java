package com.ohgiraffers.section01.list.run;

import java.util.*;


/* 설명. < 은닉화 (hiding) >
        목적: 유지보수
    *   - 타입 은닉 (다형성)
    *   - 구현 은닉 (인터페이스 활용) -> 하위 구현체를 모르게끔 하는 방법 (ex) 상위 구현체 = 하위 구현체 생성 )
    *   - 필드 및 메소드 은닉 (캡슐화(feat. private))
* */
public class Application1 {
    public static void main(String[] args) {

        /* 설명. ArrayList를 활용한 정렬 */
        /* 목차. 1. 문자열 데이터 정렬 (feat. 오름차순) */
        List<String> stringList = new LinkedList<>();    //  내림차순 할 때는 LinkedList로 변경
        // List (상위) <- ArrayList,LinkedList... (하위) => 구현체
        // 부모 타입 = 하위 구현체 (자식 클래스 - 실제 객체가 생성되는 형태)
        // 자식으로 객체 생성한 것을 부모로 받아서 타입 숨기기
        // 업캐스팅 하는 이유 List로 받으면, LinkedList <-> ArrayList 변환 용이하다.
        // 다형성 이용
        // < 타입 은닉화 기술 (type hiding)>
        // (LinkedList를 숨기고, List로 사용 ,,, -> 여기서 LinkedList 같은 부분이 "구현체"에 해당)
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println("문자열 데이터: " + stringList);

        Collections.sort(stringList);   // 사전순으로 정렬
        // String에 정의된 기준대로 정렬
        // String 클래스 내부에서 Comparable 인터페이스를 구현한 compareTo 메서드를 통해서 정렬됨
        System.out.println("정렬된 문자열 데이터: "  + stringList);

        /* 설명. 실제로는 ArrayList 안에 있는 데이터인 String에 정의된 기준(오름차순)대로 정렬됨
        *   정렬 기준은 정렬할 해당 클래스에 정의되어 있어야 함.
        *   ex. String은 기본이 오름차순으로 정렬되도록 정의되어 있음.
        * */
        Collections.sort(stringList);
        System.out.println("정렬된 문자열 데이터: " + stringList);

        /* 목차. 1-1. 문자열 데이터 내림차순 정렬 */
        /* 설명. 다루는 Iterator와 해당 컬렉션의 제네릭 타입은 웬만하면 꼭 명시하자. (feat. 다운캐스팅 방지(타입 안정성)) */
        /*  필기. */
        Iterator<String> iter = ((LinkedList<String>) stringList).descendingIterator();
        // LinkedList가 제공하는 descendingIterator()를 사용하기 위해서 LinkedList 로 변환하기

        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        
//        // 제네릭 클래스 -> 아무 타입 넣어주지 않을 경우, Object로 인식됨.
//        Iterator iter1 = ((LinkedList) stringList).descendingIterator();
//        while(iter.hasNext()){
//            System.out.println(iter.next() + ""); // 다운캐스팅 필요
//        }

        /* 설명. LinkedList
            앞(previous) | 뒤(next) 에 위치한 객체의 주소값을 가짐
        *   인덱스로 접근 가능하지만(.get(index)) 앞에서부터 순차적으로 탐색이 필요해 비효율적
        *   중간에 값을 삽입 /삭제 할 때 효율적
            ArrayList 는 삽입/삭제 시 앞/뒤 원소들을 모두 위치 변경해야 한다.
            LinkedList는 삽입/삭제 시 연결만 변경하면 된다.
            스택, 양방향 큐를 구현할 때 LinkedList를 사용 
        * */

    }

}
