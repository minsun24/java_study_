package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다. (feat. 자료형(type)) */
        // 기본형(primitive) 변수
        /* 목차. 1. 정수를 취급하는 자료형 */
        byte bNum;          // 1byte
        short sNum;         // 2byte
        int iNum;           // 4byte
        long lNum;          // 8byte

        /* 목차. 2. 실수를 취급하는 자료형 */
        float fNum;         // 4byte
        double dNum;        // 8byte

        /* 목차. 3. 문자를 취급하는 자료형 */
        char ch;            // 2byte

        /* 목차. 4. 논리값를 취급하는 자료형 */
        boolean isTrue;     // 1byte (긍정의문문 형태의 변수명 사용할 것)

        // =========================================================
        // 객체 참조형 변수
        /* 목차. 5. 문자열을 취급하는 자료형 */
        String str;         // 객체

        /* 설명. 변수에 값을 대입해 보기 */
        bNum = 1;
        sNum = 2;
        // byte, short는 예외케이스
        iNum = 3;
//        lNum = 2200000000;      // Integer number too large
        lNum = 2200000000L;     // 정수형은 기본이 int 이므로,
        // long크기 숫자(22...)를 4byte int에 넣으려고 하니 에러.
        // long 타입 사용할 때 끝에 L을 붙여서 long type임을 알려주어야 함.
        // 대략 21억 5천만이 넘을 때 ~ long 형 변수

//        fNum = 3.14;            // 실수형은 기본이 double
        // 8byte로 만든 3.14를 float(4byte)에 넣으려고 하니 에러.
        fNum = 3.14f;           // f 를 붙여 명시해주어야 함.
        dNum = 3.14;

//        ch = "a";
        ch = 'a';
        ch = 97;        // 양수만 가능 -> 아스키 코드 'a'
        // ∴ 아스키 코드, 유니코드 체계에는 음수 개념이 없기 때문
        int a = ch;     // 문자는 아스키 코드를 담음

        isTrue = true;

        str = "hello";

        /* 설명. 변수를 활용한 합계(sum), 평균(avg) 출력해보기 */
        int kor = 90;
        int math = 80;
        int eng = 75;
        int sum = kor + math + eng;
        System.out.println("sum = " + sum);

        double avg = sum / 3.0;     // 연산할 때 sum(int형)은 실수형(double)로 변환되어 계산됨.
        // 연산 시 소수점 살리고 싶으면 최소 하나는 실수형으로 계산하자.

        System.out.println("avg = " + avg);
    }
}