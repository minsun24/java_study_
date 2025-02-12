package com.ohgiraffers.section02.encapsulation.resolved;

public class Monster {
    /* 설명. 캡슐화
            private으로 선언해서 외부에서 바로 접근하지 못하도록 캡슐화 */
    /* 설명. 정보은닉 */
    private String name;
    private int hp;

    public void setInfo1(String info1){
        this.name = info1;
    }public void setInfo2(int info2){
        this.hp = info2;
    }
}
