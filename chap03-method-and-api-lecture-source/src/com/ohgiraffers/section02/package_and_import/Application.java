package com.ohgiraffers.section02.package_and_import;

//import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

import com.ohgiraffers.section01.method.Calculator;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. 패키지에 대해 이해할 수 있다. */
        /* 설명.
        *   패키지의 의미
        *   1. 클래스의 소속
        *   2. 원래는 클래스명의 일부분
        *   3. 경우에 따라 생략 가능
        * */

        /* 설명. non-static 메서드 호출을 위해 Calculator를 인지시킴 (feat. 다른 패키지에서) */
        Calculator cal = new Calculator();
        
        int plusResult = cal.plusTwoNumbers(100, 20);
        System.out.println("plusResult = " + plusResult);   // 120

        int maxNum = cal.maxNumberOf(100, 20);
        System.out.println("maxNum = " + maxNum);

        // import 사용
        /* 설명. static 메서드 호출 해보기 (feat. 다른 패키지에서) */
        


    }
}
