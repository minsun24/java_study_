package com.ohgiraffers.section02.functionInterface;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class Application1Consumer {
    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스(5가지) 중 Consumer 타입에 대해 이해하고 사용할 수 있다.  */
        /* 설명. 반환형이 없고 (소비만 하는) 메소드 관련 람다식 */

        // 필기. Consumer
//        Consumer<String> consumer  = (str) -> {
//            System.out.println(str + "이(가) 입력됨");
//        };
        Consumer<String> consumer  = str -> System.out.println(str + "이(가) 입력됨");

        consumer.accept("피카츄");
        consumer.accept("hello");

        // 필기. BiConsumer
        BiConsumer<String, LocalTime> biConsumer =
                (str, time) -> System.out.println(str + "(이)가" + time + "에 입력됨.");
        biConsumer.accept("정민선", LocalTime.now());  //  정민선(이)가10:04:05.214881500에 입력됨.

        /* 설명. 같은 난수 생성 방법
        *   1. Math 클래스 사용 : (int)(Math.random() * 갯수) + 초깃값
        *   2. Random 클래스 사용 : new Random().nextInt(갯수) + 초깃값  => 다운캐스틩을 할 필요가 없다.
        * */
        ObjIntConsumer<Random> objIntConsumer =
                (random, bound) -> System.out.println("1부터 " + bound + "까지의 난수 발생 : " +
                        (random.nextInt(bound) + 1));
        objIntConsumer.accept(new Random(), 10);    // 1부터 10까지의 난수 발생 : >> 실행할 때마다 난수 생성되어 출력됨

        // 필기. ObjIntConsumer
        //  Object형, Int형을 매개변수로 받는 추상 인터페이스




    }
}
