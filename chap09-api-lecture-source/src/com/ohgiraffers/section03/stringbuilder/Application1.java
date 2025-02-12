package com.ohgiraffers.section03.stringbuilder;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. String과 StringBuilder의 차이점에 대해 이해하고 사용할 수 있다. */
        StringBuilder sb = new StringBuilder("java");
        StringBuilder sb1 = new StringBuilder("java");
//        sb = "new";
        sb = sb1;

//      StringBuilder sb2 = "java";     // 리터럴 형태로는 객체 생성이 안됨. (???? 왜 재할당도 안되지? )

        String testStr = "java";

        StringBuilder testSb = new StringBuilder("kotlin");

        for(int i=0; i<9; i++){
            testStr += i;
            testSb.append(i);

            System.out.println("String의 경우: " + System.identityHashCode(testStr));
            System.out.println("StringBuilder의 경우: " + System.identityHashCode(testSb));
        }

        System.out.println("String의 결과: " + testStr);
        System.out.println("StringBuilder의 결과: " + testSb);
        // 객체 주소값 변하지 않음. 필드 용량의 크기만 변하는 것
        // 객체 자체가 커지는 것이 아니라, 동일한 객체의 capacity(용량)의 크기를 키우는 것

        // 하나의 객체를 운용함으로써 공간을 낭비하지 않음.

    }
}
