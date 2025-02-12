package com.ohgiraffers.section01.section02.enumtype;

public class Application {
    public static void main(String[] args) {
        Subjects subject1 = Subjects.JAVA;
        /* 필기.
            실행 시 (= 최초 접근 시 - lazy)
            => 각각의 필드에 맞는 객체가 (싱글톤하게) 생성됨
            한 번 생성되면 다시 생성되지 않음.
        */
//        기본 생성자 실행됨...
//        기본 생성자 실행됨...
//        기본 생성자 실행됨...
//        기본 생성자 실행됨...
//        기본 생성자 실행됨...
//        기본 생성자 실행됨...

//        Subject subject2 = new Subjects(); // 우리가 enum 타입의 생성자를 직접 사용할 수 없다.

        Subjects subject2 = Subjects.HTML;
        Subjects subject3 = Subjects.JDBC;
        // 필기. 이후로는 생성자가 실행되지 않음 -> 싱글톤 타입

        Subjects subject4 = Subjects.JAVA;

        /* 설명.
        *   1. 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며, 인스턴스가 각각 한 개임을 보장한다.
        *       작성한 순서에 따라 각각은 다른 인스턴스가 생성되며 최초 호출 시에 enum의 생성자를 활용해
        *       생성된다. (lazy singleton 개념)
        *   -
        *   2. 단일 인스턴스를 보장하기에 (==) 비교가 가능하다. (동일 객체 비교)
        * */
        /* 필기. 서로 다르다고 뜨는 건 다른 객체이기 때문*/
        if(subject1 == subject2) { 
            System.out.println("두 과목은 같은 과목이다.");
        }else{
            System.out.println("두 과목은 서로 다른 과목이다. ");
            //  두 과목은 서로 다른 과목이다.
        }
        /* 필기. 서로 같다고 뜨는 건 서로 같은 객체이기 때문 (=> 싱글톤 객체이므로) */
        if(subject1 == subject4) { // 같다면 싱글톤하게 관리되는 것?
            System.out.println("두 과목은 같은 과목이다.");
        }   // 두 과목은 같은 과목이다.


        /* 설명. 3. 상수 필드명을 문자열로 변경하기 쉽다. */
        System.out.println(Subjects.JAVA.toString());   // JAVA
        // 우리가 재정의해서 쓸 수 있다.
        System.out.println(Subjects.JAVA.name());       // JAVA
        // 오버라이딩 불가능

        /*  설명. 4. values()를 사용하면, 상수값 배열을 반환받고 이를 활용하여 연속처리해줄 수 있다.
        *           (상수 필드에 주입된 객체들을 순 회할 수 있다.
        *

         */
        Subjects[] subjects = Subjects.values();    // enum에 선언된 상수들의 순서를 인덱스 체계로 출력
        for(Subjects sub : subjects) {
            System.out.println(sub.toString());
        }

         /* 설명. 5. 타입 안정성을 보장한다.*/
        printSubjects(Subjects.JAVA);
//        printSubjects(0); // Subjects 타입이 아니면, 전달할 수 없다.


    }

    private static void printSubjects(Subjects subjects) {
    }
}
