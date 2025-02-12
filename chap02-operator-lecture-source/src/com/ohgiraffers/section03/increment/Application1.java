package com.ohgiraffers.section03.increment;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표. 단항 연산자이자, 증감연산자에 대해 이해하고 활용할 수 있다. */
        int num = 20;
        System.out.println("num = " + num);     // 20

        num ++;     // 후위 연산자
        System.out.println("num = " + num);     // 21

        ++num;      // 전위 연산자
        System.out.println("num = " + num);     // 22
        
        
        num --;
        System.out.println("num = " + num);     // 21
        --num;
        System.out.println("num = " + num);     // 20

        /* 설명. 다른 연산자와 함께 쓰이거나 출력문 안에서는 전위/후위 연산자가 해석의 차이를 일으킨다.  */
        int firstNum = 20;
        int result = firstNum++ + 3;
        System.out.println("result = " + result);       // 23
        System.out.println("firstNum = " + firstNum);   // first == 21

        System.out.println("firstNum++ = " + firstNum++);   // 21
        // 출력 후 1 증가
        System.out.println("firstNum = " + firstNum);       // 22


        int a = 3;
        int b = 5;
        int c = -1;
        int d = a + --b;    // d = 3 + 4, b== 4
        b = 2 * (-c + a++) - d;
        // b = 2 * (1+3) - 7 == 1
        // a == 4;
        c *= 2;  // c = -1 * 2 == -2
        a = b++ + c;  // a = 1 - 2 = - 1 , b==2


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
