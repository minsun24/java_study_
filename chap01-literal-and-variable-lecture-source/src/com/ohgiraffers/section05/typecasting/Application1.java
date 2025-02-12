package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표. 자동 형변환 규칙에 대해 이해할 수 있다. */

        byte bNum = 1;  // int를 byte에 담지만, 단순 리터럴일 경우 성립한다.
        bNum = (byte) (bNum + 1);

        short sNum = 2;

        int iNum = 3;

        /* 설명. 연산 시에도 자동으로 큰 자료형에 맞춰서 낮은 자료형이 자동 형변환 된다. */
        int num1 = 10;
        long num2 = 20L;
        long result1 = num1 + num2;     // num1 을 long타입으로 변환해 long과 연산
        // long result1 = (long)num1 + num2; 와 같음.

        System.out.println("result1 = " + result1);

        /* 설명. 문자형은 int형으로 자동형변환이 가능하므로 유니코드를 알 수 있다. */
        int uniNum = 'f';
        System.out.println("uniNum = " + uniNum);   // 102

    }
}
