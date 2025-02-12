package com.ohgiraffers.section01.list.run;

import java.sql.SQLOutput;
import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. Stack에 대해 이해하고 사용할 수 있다. */
        /* 설명. Stack이란 ?
        *   후입 선출 (LIFO) 또는 선입후출(FILO)의 자료구조로
        *   push(), pop(), peek() 등의 메소드를 활용해 자료를 처리할 수 있다.
        *   peeK() 가장 최근 값을 조회하는 메서드
        *   search() :
        *   -
        *   -  Stack
        *        ---------------------------
        *       |                   <--- push (삽입)
        *       |                   ---> pop (삭제)
        *       ---------------------------
        *
        * */

        /* 설명. Stack 객체 생성 후 데이터 추가 */
        Stack<Integer> integerStack = new Stack<Integer>();
        
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);   // top

        System.out.println("integerStack = " + integerStack);

        System.out.println("peek() = " + integerStack.peek());

        /* 설명. Stack은 마지막부터 하나씩 순차적으로 카운팅 한다.(feat. 동등 비교가 가능해야 한다.(e, h 오버라이딩)) */
        System.out.println("search(): " + integerStack.search(2));
        // top 원소부터 탐색해서 해당 값이 몇 번째에 위치하는지 반환

        System.out.println("pop() " + integerStack.pop());
        System.out.println("pop() " + integerStack.pop());
        System.out.println("pop() " + integerStack.pop());
        System.out.println("pop() " + integerStack.pop());
        System.out.println("integerStack = " + integerStack);

        System.out.println("integerStack = " + integerStack);

    }
}
