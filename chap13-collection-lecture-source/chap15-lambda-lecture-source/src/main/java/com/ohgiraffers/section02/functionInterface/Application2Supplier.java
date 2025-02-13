package com.ohgiraffers.section02.functionInterface;

import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class Application2Supplier {
    public static void main(String[] args) {

        /* 수업목표. 표준 함수적 인터페이스 중 Supplier에 대해 이해하고 사용할 수 있다. */
        /* 설명. 매개변수 없고, 반환값만 있는 메소드 관련 람다식 */

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();   // 매개변수 1개일 때만 () 소괄호 생략 가능
        // 필기. LocalDateTime 이 반환혀잉라는건가???????
        //  Nope.
        System.out.println(supplier.get());


        /* 목차. 2. BooleanSupplier
        *       반환형이 Boolean인 */
        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() * 2); // + 시작수 명시 x (0 ~ 시작)
            return random == 0 ? false : true;
        };
        System.out.println("랜덤 true or false 생성기 : " + booleanSupplier.getAsBoolean());


    }
}
