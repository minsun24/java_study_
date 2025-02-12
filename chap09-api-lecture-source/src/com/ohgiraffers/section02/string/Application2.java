package com.ohgiraffers.section02.string;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 문자열 객체를 생성하는 다양한 방법을 숙지하고 인스턴스가 생성되는 방식을 이해할 수 있다. */
        /* 설명.
                문자열 객체를 만드는 방법 
                1. "" 리터럴 형태: 동일한 값을 가지는 인스턴드(= 동등 -> equals(), hashcode() 오버라이딩 되어있을 것??)
                                 를 단일 인스턴스로 관리한다.
                2. new String("") 형태 : 매번 새로운 인스턴스를 생성한다. (주소값이 매번 다름)
        *   */
        String str1 = "java";
        String str2 = "java";

        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2: " + (str1 == str2)) ;     // (==)
        System.out.println("str2 == str3: " + (str2 == str3)) ;     //
        System.out.println("str3 == str4: " + (str3 == str4)) ;

        /* 설명.
         *   stack
         *   | heap 내부에 (constant pool = 상수풀 ) 존재 -> hashcode, equals 동등 객체는 하나만 관리하는 곳
         *   | static
        *
        * */

        System.out.println("문자열 값 비교는 equals() 를 사용하자 : " + str2.equals(str3));
        System.out.println("hashCode() 도 확인 : " + str2.hashCode() + ", " + str3.hashCode());


        /* 설명. 문자열은 불변 객체 (immutable object) 로 변화를 주면 항상 새로운 객체(인스턴스)가 생성된다. */
        String str = "apple";
        System.out.println(System.identityHashCode(str));   // 주솟값을 주면 해시코드 형태가 출력된다(?)
        // 해시코드 : 381259350


        // 문자열을 덧붙이는 경우에도 새로운 객체가 생성되는지 확인
        str += ", banana";
        System.out.println(System.identityHashCode(str));
        // 해시코드 : 668386784

        // 기존 문자열에 추가 문자열을 덧붙이는 경우, 새로운 객체가 생성되어 할당된다.
        //

        // StringBuilder, StringBuffer 의 경우, 가변적인 String 객체로,
        // 문자열 덧붙일 때 객체의 주소가 변하지 않음.

    }

}
