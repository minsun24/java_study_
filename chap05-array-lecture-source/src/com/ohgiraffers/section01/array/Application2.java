package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 배열의 사용방법을 익혀 배열을 사용할 수 있다. */
        /* 설명.
        *   배열의 사용 방법
        *   1. 배열의 선언
        *   2. 배열의 크기 할당
        *   3. 배열의 인덱스 공간에 값 대입
        * */

        int[] iArr;
        iArr = new int[10];
        char[] cArr;    // char cArr[] 도 가능 but 지양하자.

        cArr = new char[5]; // index : 0 ~ 4로 각 칸을 구분
        System.out.println("cArr에 담긴 값 = " + Arrays.toString(cArr));
        // cArr에 담긴 값 = [ ,  ,  ,  ,  ]
        // '\u0000' 으로 초기화되어 있음.


        System.out.println("cArr의 주소를 10진수 형태로 보고 싶다: " + cArr.hashCode());
        // result: 1078694789
        // 참조형.hashCode() : 주솟값을 10진수로 바꿔준다.
//        int num = 9;
//        System.out.println("num.hashCode() = " + num.hashCode());
        // 원시형 변수에는 hashCode() 사용 불가

        cArr = null;    // 가리키는 대상과의 연결 끊음.<참조 삭제>
        // 자료형의 기본값(?) 은 null
        System.out.println("cArr의 주소를 10진수 형태로 보고 싶다: " + cArr.hashCode());
        // 에러. .NullPointerException: Cannot invoke "Object.hashCode()" because "cArr" is null
        // null 값인데 포인터로 접근하기 때문에 에러 발생


        /* 설명. 1. 주솟값을 직접 건드릴 수 없다. */
        // Java는 c의 포인터처럼 주솟값을 사용하는 방법이 없음
        // 한 번 참조가 끊어지면, heap에 있는 공간 접근x
        /* 설명. 2. GC(가비지 컬렉터)
        *       자동 삭제
        *       heap에 old 영역으로 넘어감. old영역이 어느 정도 차게 되면, 가비지 컬렉터가 비움
        *       가비지 컬렉터가 자동 삭제하는 알고리즘 : (찾아보기) 마크 & 스윕(?)
        * */






    }
}
