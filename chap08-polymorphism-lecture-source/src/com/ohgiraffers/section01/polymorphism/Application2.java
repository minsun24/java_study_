package com.ohgiraffers.section01.polymorphism;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하여 객체 배열을 만들어 다양한 인스턴스들을 연속 처리할 수 있다. */
        Animal[] animals = new Animal[5];

        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        System.out.println(Arrays.toString(animals));

        for (int i = 0; i < animals.length ; i++) {
            animals[i].cry();
        }
        /* 설명. instanceof
        *       형변환 가능 여부를 확인하며
        *       true / false로 결과를 반환
        * */
        for(Animal an : animals){
            an.cry();
            if(an instanceof Tiger){
                ((Tiger)an).bite();
            }
            if(an instanceof Rabbit){
                ((Rabbit)an).jump();
            }
        }
        /* 설명.
        *   추상화 / 캡슐화 / 다형성 /   ...?
        *
        * */


    }
}
