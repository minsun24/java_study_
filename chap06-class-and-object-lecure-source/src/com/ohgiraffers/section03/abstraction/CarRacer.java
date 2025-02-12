package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    private Car myCar = new Car();    // 자동차 객체
    // heap 영역에 Car 객체 생성되며 ....


    /* 설명. 기능 1. 시동 걸기 */
    public void startUp() {
        this.myCar.startUp();   // this 생략 가능.

    }
    /* 설명. 기능 2. 전진 */
    public void stepAccelator() {
        this.myCar.go();
    }
    /* 설명. 기능 3. 속도가 0이 될때까지 멈추기 */
    public void stepBreak() {
        this.myCar.stop();
    }
    /* 설명. 기능 4. 차를 멈추기 */
    public void turnOff() {
        this.myCar.turnOff();
    }
}