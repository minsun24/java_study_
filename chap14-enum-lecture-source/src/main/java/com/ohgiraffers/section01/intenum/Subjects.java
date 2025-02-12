package com.ohgiraffers.section01.intenum;

/*
    필기.
     상수들의 모음(단순 열거)은 인터페이스로도 만들 수 있는데,
     ENUM을 사용하는 이유는 무엇일까?

 */


public interface Subjects {
    // backend skills
    public static final int JAVA = 0;
    public static final int MARIADB = 1;
//    public static final int JDBC = 2;
    public static final int BACKEND_JAVASCRIPT = 2;


    // frontend skills
    public static final int HTML = 0;
    public static final int CSS = 1;
    public static final int FRONTEND_JAVASCRIPT = 2;

    /*  필기. 접두사를 붙이는 거면, 그냥 다른 변수 만든 거 아닌가?
    *       <=>
            enum 은 구분 가능.
    *       변수들의 순서를 기억 -> 마치 배열처럼....
    * */

}
