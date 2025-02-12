package com.ohgiraffers.section03.abstraction;

/* 수업목표. 추상화 - 시스템 요구사항을 만족하는 객체지향 프로그램 만들기
*   유저 => 레이서(CarRacer) => 차(Car)
* */
/* 설명. 
*   클래스
*   1. 객체를 만들기 위한 도구이다.
*   2. 하나의 새로운 사용자 정의형 타입
*   3. 관련있는 속성과 기능의 묶음 => 객체는 기능을 먼저 고려하는 게 좋다 !!
*
*   mybatis, jsp ...
* */

/* 설명.
    추상화란? *****
    (객체들의) 공통된 부분을 추출하고, 공통되지 않고 불필요한 부분을 제거한다는 의미를 가지며,
    추상화의 목적은 (객체들의) 유연성을 확보하기 위함이다.
    유연성 확보는 여러 곳에 적용될 수 있는 유연한 객체를 의미하며, 재사용성이 높아질 수 있게 한다는 의미이다.
    (우리는 자연스럽게 추상화를 이루었지만 그렇게 추상화된 클래스로 유연한 객체들을 생성할 수 있다.)

   설명. *****
    1. 협력 (객체간의 필요한 의사소통)
    2. 책임 (객체가 가진 기능)
    3. 역할 (기능들이 모이면 역할)
 */

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        CarRacer racer = new CarRacer();    // (Car 한 대를 소유한) 카레이서 객체 생성                //

        int input = 0;

        // 메뉴를 뿌린다.
        do{
            System.out.println("====== 카레이싱 프로그램 ======");
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            input = sc.nextInt();

            switch(input){
                case 1:     // 시동 걸기
                    racer.startUp();
                    break;
                case 2:     // 전진
                    racer.stepAccelator(); 
                    break;
                case 3:     // 정지
                    racer.stepBreak();
                    break;
                case 4:     // 시동 끄기
                    racer.turnOff();
                    break;
                case 9:     // 프로그램 종료
                    System.out.println("프로그램을 이용해 주셔서 감사합니다 ! :) ");
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다. ");

            }
        }while(input != 9);

    }
}
