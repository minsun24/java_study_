package com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. 싱글톤 패턴에 대해 이해할 수 있다.
            설명.
             singleton pattern 이란?
                애플리케이션이 시작되고 난 후 어떤 클래스가 최초 한 번만 메모리에 할당(객체)되고,
                그 메모리에 인스턴스가 단 하나만 생성(**생성자에 private **)되어 공유되기 하는 것을 싱글톤 패턴이라고 한다.
                (메모리 및 리소스 낭비 방지 목적)

            설명.
               장점
               1. 첫 번째 이용 시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만
                  두 번째 이용 시에는 인스턴스 생성 시간 없이 바로 사용할 수 있다. (feat. 재사용)
               2. 인스턴스가 절대적으로 한 개만 할당되는 것을 보증할 수 있다.
               단점
                1. 싱글통 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결함도가 높아진다.
                2. <동시성 문제(=> 멀티 쓰레드와 밀접한 관계)>를 고려해서 설계해야 하기 때문에 난이도가 높다.
            설명.
               구현 방법
               1. 이론 초기화 (Eager Initialization)
               2. 늦은 초기화 (Lazy Initilaizaiton)
        *   */

        /*
            thread == 요청 단위
            요청 -> Heap에 객체 생성 / static은 객체가 모두 공유 가능한 영역
            multi thread : 하나의 static 자원을 기다리게 됨 => 서버 부하
         */


    }
}
