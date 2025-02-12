package com.ohgiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. staitc 키워드에 대해 이해할 수 있다. */
        /* 설명.
        *   static
        *   : 프로그램이 실행될 때 정적 메모리 영역(static 영역 또는 클래스 영역)에 할당하는 키워드이다.
            *   여러 인스턴스가 공유해서 사용할 목적의 공간이다.
            *   대표적인 예로 싱글톤(singleton) 객체 또는 설정값(DB 연결 정보)를 담을 용도가 있다.
        * */

        StaticTest st1 = new StaticTest();

        /* 설명. 현재 두 필드가 가지고 있는 값 확인 */
        System.out.println("non-static field: " + st1.getNonStaticCount());
        System.out.println("static field: " + st1.getStaticCount());
        // 모두 0으로 초기화되어 있음.
        // static은 공유

        /* 설명. 각 필드 값을 증가 */
        st1.increaseNonStaticCount();
        st1.increaseStaticCount();

        /* 설명. 두 필드 값 확인 */
        System.out.println("non-static field: " + st1.getNonStaticCount()); // 1
        System.out.println("static field: " + st1.getStaticCount());        // 1

        /* 설명. 새로운 객체 생성 */
        StaticTest st2 = new StaticTest();
        System.out.println("non-static field: " + st2.getNonStaticCount()); // 0
        System.out.println("static field: " + st2.getStaticCount());        // 1
        // st1이 증가시킨 결과 값 1이 보여짐. => static 영역에 위치해 모든 객체가 공유해서 사용하게 되는 것



        /* 설명. static 표기 방법
        *       public final static
        *       publiic static final
        * */



    }
}
