package com.ohgiraffers.section01.list.run;

import java.util.*;

public class  Application3{
    public static void main(String[] args) {

        /* 수업목표. List 계열을 출력하는 4가지 방법   */
//        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();
        List<String> list= new Vector<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("pear");
        list.add("grape");

        /* 설명. 1. toString() 활용하기 */
        System.out.println(list);

        /* 설명. 2. for문 활용하기
        *       list.size() : 리스트의 크기(원소 개수) 반환
        *       list.get(index) : index 위치의 원소 가져오기
        * */
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        /* 설명. 3. for-each문 활용하기 */
        for(String str : list) {
            System.out.println(str);
        }

        /* 설명. 4. iterator 활용하기 */
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());    // next()는 stream
        }

        /* 설명. 1번 인덱스(두 번째) 과일 수정   */
        /*  필기. get, set에서는 => ArrayList 사용이 효율적 */
        list.set(1, "pineapple");   // 인덱스의 값 수정
        System.out.println("2번째 요소 수정 후: " + list);

        /* 설명. list가 관리하는 요소 제거 */
        /* 설명. 3번째 요소 제거 */
        /*  필기. add(index, value) 의 경우에는 => LinkedList 사용이 효율적  */
        list.remove(2);
        System.out.println("3번째 요소 제거 후 : " + list);

        list.clear();   // 리스트 객체는 존재하지만, 리스트의 원소가 모두 제거됨. (아무것도 저장하고 있지 않음)
        System.out.println("모든 요소 제거 후: " + list);
//        list = null;      // null 을 대입하면 이후 list 를 활용하는 곳에서는 NullPointException 이 발생한다.
        //
        /* 설명. 모든 요소가 제거된 이후 */
//        System.out.println("isEmpty(): " + list.isEmpty());
        // 객체는 있지만, 저장한 원소가 없을 때(=> 리스트가 비어 있을떄)
        // isEmpty()  에 true가 출력됨

        /* 설명. "null"과 객체는" 있지만 비어있음"을 잘 구분하자! */


    }
}
