package com.ohgiraffers.section02.set.run;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. LinkedHashSet에 대해 이해하고 활용할 수 있다. */
        /* 설명.
        *   LinkedHashSet은 저장 당시의 순서를 유지하는 특성을 가지고 있따.
        *   (중복 제거 + 순서 유지)
        * */

        Set<String> lSet = new LinkedHashSet<String>();
        lSet.add("ramen");
        lSet.add("pork");
        lSet.add("kimchi");
        lSet.add("chicken");
        lSet.add("soup");
        System.out.println("lSet: " + lSet);
//        lSet: [ramen, pork, kimchi, chicken, soup]
//        삽입한 순서대로 출력된다.
        lSet.add("soup");
        System.out.println("lSet: " + lSet);
//        중복된 값을 넣으면 오류는 나지 않지만, 삽입되지 않음.

        Iterator<String> iter = lSet.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }


    }
}
