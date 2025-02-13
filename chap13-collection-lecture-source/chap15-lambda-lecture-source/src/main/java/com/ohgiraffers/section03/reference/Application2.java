package com.ohgiraffers.section03.reference;

import java.util.function.Function;
import java.util.function.Supplier;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 기존에 존재하는 생성자를 참조한 람다식을 활용할 수 있다. */

//        Function<String, Member> constMember =
//                  x -> {return new Member(x);};
//                  x -> new Member(x);
        // 필기. 생성자의 경우  >>  클래스타입::new << 으로
        //  Function의 <>을 통해 알아서 생성자 매개변수 타입을 인지

        Function<String, Member> costMember = Member::new;

        Member member1 = costMember.apply("A");   // String 매개변수 있는 생성자 호출됨
        System.out.println("member1 = " + member1); // member1 = Member{memId='A'}

        Member member2 = costMember.apply("B");     //  String 매개변수 있는 생성자 호출됨
        System.out.println("member2 = " + member2);   //  member2 = Member{memId='B'}

        /* 설명. 알아서 매개변수 유무 및 타입 인식  */
        Supplier<Member> costMember2 = Member::new;
        Member member3 = costMember2.get();
        System.out.println("member3 = " + member3);     // 기본 생성자 호출됨 member3 = Member{memId='null'}


    }
}
