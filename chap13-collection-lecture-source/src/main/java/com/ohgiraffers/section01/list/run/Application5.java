package com.ohgiraffers.section01.list.run;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


/*  필기.
      ArrayList : add(), get(index) => 원소값으로 객체의 주소값을 가짐  <객체 정렬>
      Stack : push(), pop()
      Queue : offer(), poll()
 */


public class Application5 {
    public static void main(String[] args) {

        /* 수업목표. Queue에 대해 이해하고 활용할 수 있다. */
        /*  설명
        *    ** Queue 란?
        *       선형 메모리 공간에 데이터를 저장하여 순서를 유지하기 위한 선입선출(FIFO) 방식의 자료구조
        *       대부분 LinkedList 를 많이 사용한다.
        *       대용량 트래픽 처리에 큐 알고리즘을 주로 사용 (ex. 채팅...)     *
        *       -
        *       ---------------------------
        *    <--- poll (삭제)          <--- offer (삽입)
        *       ---------------------------
        *
        * */
//        Queue que = new Queue(); // Queue 생성자를 활용할 수 있다.
                                    // (Queue의 구현체는 하위 타입으로 만들어야 한다.)
//        Queue que = new LinkedList<String>();


        /* 설명. PriorityQueue 를 활용하면 선입선출 + 정렬의 개념을 가져갈 수 있다.
        *       트리 구조 - 애초에 정렬이 된 상태로 저장이 된다.
        *   - 넣을 때는 선입선출 (큐)의 특징대로 들어가고,
        *   - pop() 할 때 (먼저 들어간 게 먼저 나오는 게 아니라,) 우선순위(기본-오름차순)대로 나온다.
        * */
        Queue<String> que = new PriorityQueue<String>();    // 기본 - 오름차순
//        Queue<String> que = new PriorityQueue<>(Collections.reverseOrder());    // 내림차순

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");
        System.out.println("que = " + que);

        System.out.println("peek(): " + que.peek());
        System.out.println("que = " + que);

        System.out.println("poll(): " + que.poll());
        System.out.println("que = " + que);
        System.out.println("poll(): " + que.poll());
        System.out.println("que = " + que);
        System.out.println("poll(): " + que.poll());
        System.out.println("que = " + que);
        System.out.println("poll(): " + que.poll());
        System.out.println("que = " + que);
        System.out.println("poll(): " + que.poll());
        System.out.println("que = " + que);




    }
}

