package com.ohgiraffers.section02.set.run;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. TreeSet에 대해 이해하고 활용할 수 있다.
        *          (정렬 가능)
        * */
        /* 설명. Tree 구조를 활용해 중복 제거 + 정렬을 해준다. */
        Set<String> tSet = new TreeSet<>();

        tSet.add("ramen");
        tSet.add("pork");
        tSet.add("beef");
        tSet.add("chicken");
        tSet.add("pizza");
        System.out.println("tSet :" + tSet);
//        tSet : [beef, chicken, pizza, pork, ramen]

        /* 설명. 간이 로또 번호 발생기(feat. 보너스 번호 추출 제외)
        *      1부터 45까지 중복되지 않고 오름차순 정렬된 6개의 값 추출하기
        * */
        Set<Integer> lotto = new TreeSet<>();

        while(lotto.size() < 6){
            lotto.add((int) Math.random() * 45 + 1);
        }
        System.out.println("lotto :" + lotto);

    }
}

