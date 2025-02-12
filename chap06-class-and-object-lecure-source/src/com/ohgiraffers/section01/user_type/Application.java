package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Application {

    /* 설명.
    *   객체지향프로그래밍(OOP)란?
    *   OOP (Object Oriented Programming Language) 객체를 지향하는 프로그래밍 언어
    *   : 추상화, 캡슐화, 상속, 다형성을 적용해 "유지보수성"을 고려한 응집력 높고 결합도 낮은
    *       객체 위주의 개발 방식을 적용한 프로그래밍을 말한다.
    * */

    /* 설명.
    *   객체지향의 특징(4대 특징)
    *   - 추상화(Abstraction) (추상화를 제외하면 3대 특징)
    *   - 캡슐화(Encapsulation)
    *   - 상속(Inheritance)
    *   - 다형성(Polymorphism)
    * */


    public static void main(String[] args) {
        String id = "minsun";
        String pwd = "pass01";
        String name = "정민선";
        int age = 23;
        char gender = '여';
        String[] hobbies = new String[]{"축구", "볼링", "테니스"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("취미들 : " + Arrays.toString(hobbies));

        /* 설명.
        *   이렇게 변수들로만 관리할 때 발생할 수 있는 문제점
        *   1. 많은 변수들을 관리하기 어렵다.(한 묶음으로 생각하거나 코딩할 수 없다.)
        *   2. 메소드의 전달인자로 전달할 값이 많으므로, 매개변수의 갯수가 늘어난다. (냄새나는 코드)
        *   3. 메소드의 반환형으로는 하나의 타입만 간으하지만 현재의 변수들로는 불가능
        * */
        Member mem1 = new Member();
        Member mem2 = new Member();

        System.out.println("me = " + mem1);
        //com.ohgiraffers.section01.user_type.Member@6d311334

        /* 설명. 사람 한 명씩 접근해 이름을 부여하는 느낌의 코드 */
        mem1.name = "김철수";
        mem2.name = "김영희";

        /* 설명. 김영희씨만 완성해보자. */
        mem2.age = 23;
        mem2.gender = '여';
        mem2.hobbies = new String[]{"볼링", "하키"};
        mem2.id = "user02";
        mem2.pwd = "pass02";
        System.out.println("김영희씨의 이름과 나이를 말해주세요 : "
                + mem2.name + "이구요, 나이는 " + mem2.age +"세입니다.");

        /* 설명. 객체 메소드 사용  */
        Member minsun = new Member();
        minsun.name = "정민선";
        minsun.login();

        /* 설명. 하나의 묶음으로 전달할 수 있고(매개변수 1개) 반환핳 수 있다. */
        Member renamedMem = test(mem2);
        // 얕은 복사이기 때문에 renamedMem이 mem2의 주소로 연결된 것
        System.out.println(renamedMem.name);
        System.out.println(renamedMem.age);

    }

    private static Member test(Member mem2) {
        System.out.println("개명하고 싶어! ");
        mem2.name = "김영희"; // 주소로 객체에 접근해서 name필드 수정
        return mem2;
    }

}
