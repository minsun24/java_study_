package com.ohgiraffers.section01.method;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

// 메인이 있는 부분
public class Application7 {
    public static void main(String[] args) {

        /* 수업목표. 다른 클래스에 작성한 메서드를 활용할 수 있다. */

        Calculator calculator = new Calculator();  // Calculator 클래스에 작성될 non-static 메서드를 인지

        int first = 100;
        int second = 50;

        /* 설명. 덧셈 */
        // 출력하기로만 할 때, 반환값이 String 으로 만들어짐.
        System.out.println("두 수의 합은? " + calculator.plusTwoNumbers(first, second));

        /* 설명. 최소값 */
        System.out.println("두 수 중 작은값은? " + calculator.minNumberOf(first, second));

        /* 설명. 최대값 */
        System.out.println("두 수 중 큰 값은? " + maxNumberOf(first, second));

    }
}
