package com.ohgiraffers.section03.abstraction;

public class Car {
    private boolean isOn = false;       // 시동 on/off 상태 - boolean형의 기본은 false
    // 자동차는 처음에 멈춘 상태로 대기

    private int speed;      // 속도



    // 설명 기능 1. 차에 시동 걸기
    public void startUp() {
        if(this.isOn){
            System.out.println("이미 시동이 걸려 있습니다. ");
        }else{
            // 시동이 걸려있지 않은 상태
            this.isOn = true;
            System.out.println("차에 시동을 걸었습니다. 부릉 부릉 @~@! ");
        }
    }

    // 설명 기능 2. 차에 속도 높이기 (엑셀 밟기)
    public void go() {
        if(this.isOn){
            this.speed += 10;   // 엑셀 1회 밟으면 속도 10씩 증가
            System.out.println("차가 앞으로 움직입니다. 현재 속도는 : " + this.speed);
        }else{
            System.out.println("% 차에 시동이 걸려있지 않습니다. 차에 시동을 먼저 걸어주세요 ! %");
        }
    }
    // 설명 기능 3. 차를 멈추기 (= 속도를 0으로 만들기)
    public void stop() {
        if(this.isOn){
            if(speed > 0){
                speed = 0;      // 급브레이크! 속도를 아예 0으로 만든다.
                System.out.println("급브레이크를 밟았습니다. 차가 멈춥니다. ");
            }else{
                System.out.println("차는 이미 멈춰 있는 상태입니다. ---");
            }
        }else{
            System.out.println("% 차에 시동이 걸려있지 않습니다. 차에 시동을 먼저 걸어주세요 ! %");
        }
    }

    // 설명 기능 4. 차 시동 끄기
    public void turnOff() {
        if(this.isOn){
            if(speed > 0){
                System.out.println("달리는 상태에서는 시동을 끌 수 없습니다. 차를 우선 정지시켜주세요.");
            }else{
                isOn = false;      // 시동은 켜져 있지만, 멈춰있는 상태에서 시동 끄기
                System.out.println("시동을 끕니다. 다시 운행하시려면 시동을 켜 주세요 !! ~@~");
            }
        }else{
            System.out.println("이미 시동이 꺼져있는 상태입니다. 시동 상태를 확인해주세요. ");
        }
    }






}
