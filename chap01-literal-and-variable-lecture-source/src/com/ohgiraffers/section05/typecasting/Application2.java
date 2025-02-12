package com.ohgiraffers.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표. 강제 형변환 규칙에 대해 이해할 수 있다. */
        /* 설명.
        *   강제 형변환
        *   바꾸려는 자료형으로 캐스팅 연산자((자료형))을 이용하여 형변환한다.
        * */
        long lNum = 8000000000L;    // 80억 0:9개
//        int iNum = lNum;
        // 에러.
        // incompatible types: possible lossy conversion from long to int */

        int iNum = (int)lNum;
        System.out.println("iNum = " + iNum);   // iNum = -589934592
        // long 타입이 int로 잘려서 의도하지 않은 결과값이 도출됨.
        // 데이터 손실 발생. 경우에 따라 부호 및 값까지 바뀜.

        /* 설명. 실수형 자료형 -> 정수형 자료형으로 강제 형변환하면 의도적으로  소수점 이하를 제거할 수 있다. */
        float avg = 31.235f;
        int floorNum = (int) avg;
        System.out.println("floorNum = " + floorNum);   // 31
        // 실수형 -> 정수형 (강제 형변환) 시 소수점이 제거되는 효과

    }
}
