package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 오버 플로우에 대해 이해할 수 있다. */
        /* 설명.
        *   자료형별 값의 최대 범위를 벗어나는 경우
        *   발생한 carry를 버림처리하고 부호 비트를 반전시켜 순환한다.
        * */

        /* 설명. 오버 플로우(최대 -> 최소) */
        byte num1 = 126;
//        num1 = num1 + 1;    // 컴파일 에러. 왜? 
        num1 ++;  // num += 1;
        System.out.println("num1 = " + num1);   // 127
        
//        num1++;    // -- 오버플로우 (캐리에 의해 MSB 부호가 변경됨)
        // location: class com.ohgiraffers.section04.overflow.Application1
        System.out.println("num1 = " + num1);

        /* 설명. 언더플로우(최소 -> 최대) */
        num1--;     // num1 -= 1;
        System.out.println("num1 = " + num1);


        num1 = (byte) (num1 - 1);
        // num1 정수, 1도 정수, 정수끼리 연산은 (정수 int)
        // -> 정수를 byte 변수에 넣을 수 없어서, 컴파일 에러
        // 강제 형변환은 뒤에서 ...

    }
}
