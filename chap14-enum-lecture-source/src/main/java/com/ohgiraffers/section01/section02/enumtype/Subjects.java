package com.ohgiraffers.section01.section02.enumtype;

public enum Subjects {
    JAVA,
    MARIADB,
    JDBC,
    HTML,
    CSS,
    JAVASCRIPT;
    // 필기. 모든 상수들은 각각 객체를 가지게 된다.

    // 생성자
    Subjects() {
        System.out.println("기본 생성자 실행됨...");
    }


    @Override
    public String toString() {
        return "@@@@" + this.name() + "@@@@";
//        return super.toString();
    }
}
