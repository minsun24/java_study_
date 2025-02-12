package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    /* 설명. this.키워드  */
    public void setHp(int hp){
        if (hp >= 0) {
            this.hp = hp;
        }else{
            this.hp = 0;
        }
    }
}
