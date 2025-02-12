package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Date 클래스 사용법을 이해하고 활용할 수 있다.  */
        java.util.Date today = new java.util.Date();    // Date 객체 생성
        System.out.println("today = " + today);

        // ***** 이해하기 !!!! *****
        System.out.println("long 타입 시간 : " + today.getTime());  // ms
        System.out.println("long 타입 시간을 활용한 Date: " + new java.util.Date(0L));  // Date 클래스의 기원값(?)
        System.out.println("long 타입 시간을 활용한 Date2: " + new java.util.Date(today.getTime()));

//        today = Wed Feb 05 12:33:58 KST 2025
//        long 타입 시간 : 1738726438801
//        long 타입 시간을 활용한 Date: Thu Jan 01 09:00:00 KST 1970
//        long 타입 시간을 활용한 Date2: Wed Feb 05 12:33:58 KST 2025

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String todayFormat = sdf.format(today); // .get@@@ 사용 잘 안 함
        System.out.println("todayFormat = " + todayFormat);
        // todayFormat = 2025-02-05 12:38:35


        /* 설명. java.util.Date => java.sql.Date */
        // DB 에 맞는 포맷으로 바꿀 때
        java.util.Date today2 = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(today2.getTime());
        System.out.println("today2= " + today2 );
        System.out.println("sqlDate = " + sqlDate);

        /* 설명. java.sql.Date => java.util.Date */
        // DB타입 => 자바의 Date타입
        java.util.Date today3 = sqlDate;
        // sqlDate형은 java.util.Date의 자식 클래스 (다형성 적용)
        System.out.println("today3 = " + today3);

    }
}
