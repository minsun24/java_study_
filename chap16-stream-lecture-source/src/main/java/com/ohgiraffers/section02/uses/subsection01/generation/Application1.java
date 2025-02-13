package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Arrays;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 배열이나 컬렉션은 스트림을 이용할 수 있고 이를 이해해서 활용할 수 있다. */
        String[] sArr = new String[]{"Java", "MongoDB", "jdbc"};

        /* 목차. 1. 배열로 Stream 생성 */
        /* 설명. Arrys.stream(배열) : 배열 자료형을 Stream 자료형으로 변환 */
        System.out.println("===== 배열로 스트림 생성 =====");
//        Stream<String> strStream1 = Arrays.stream(sArr);
        /*  필기.
         *       Arrays.stream()
         *       forEach() Stream 제공 메서드
         *       forEach의 람다식에 스트림 되기 전 배열(forEach를 호출할 주체)에 있떤 요소들을 하나씩 넘겨줌 .*/
        /* 설명. forEach는 자신의 매개변수에 정의된 라다식의 매개변수로 stream의 각 요소들ㅇ르 자동으로 넘기며 순회(매번 람다식 실행)
         *
         *   필기.
         *       요소 넘겨주고 -> 그 요소로 람다식 실행
         *       다음 요소 넘겨주고 -> 그 요소로 람다식 실행
         * ...
         *  */

//        strStream1.forEach(x -> System.out.println(x));
//        strStream1.forEach(System.out::println);

        // 설명. 한 줄 코딩 (메소드 체이닝 방식) ...
        Arrays.stream(sArr).forEach(System.out::println);
        System.out.println();
        /*
            필기. forEach() 매개변수에 Consumer 타입을 넣어라
                (매개변수 유무 상관 없이) 반환형이 없는 (여기서 넣은 println()은 대표적인 반환형 없는 함수)
         */
//===== 배열로 스트림 생성 =====
//Java
//MongoDB
//jdbc

        /* 설명. Stream으로 관리되는 요소들을 원하는 갯수만큼 반복할 수 있다. */
        Stream<String> strStream2 = Arrays.stream(sArr, 0, 2);
        strStream2.forEach(System.out::println);


        /* 설명.
         *   Builder를 활용한 스트링 생성
         *   builder는 static<T> 로 되어 있는 메소드이며, 호출 시 타입 파라미터를 메소드 호출 방식으로 전달한다.
         *
         * */
        System.out.println("===== Buildere 로 스트림 생성=====");

        // 필기. 특이점 -> 메소드를 호출할 때 제네릭을 전달! 선언 및 메소드 호출 때 제네릭 서로 맞춰 주어야 함.
        Stream<String> builderStream = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길")
                .build();   // 필기. add() 한 요소들이 아래 람다식의 매개변수로 들어가게 됨....
//      builderSteram.forEach(x -> System.out.println(x));
        builderStream.forEach(System.out::println);


        /*
         * 배열 -> Streram
         * 컬렉션 -> Stream
         * 그냥 문자열? -> Stream
         *   => 람다식 이용한 한 줄 코딩이 가능해진다.
         * */






    }
}
