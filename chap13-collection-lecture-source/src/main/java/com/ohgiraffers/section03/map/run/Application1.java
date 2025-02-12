package com.ohgiraffers.section03.map.run;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Map 의 자료구조에 대해 이해하고, HashMap 을 이용할 수 있다. */
        Map<Object, Object> hMap = new HashMap<>();
        // Map의 키, 값을 Obejct 타입으로 받아서, 모든 타입을 받을 수 있는 맵으로 생성
        // 하위 구현체 : HashMap
        // Map.put(key, value) 로 맵에 삽입
//        hMap.put("one", new java.util.Date());
        hMap.put(new String("one"), new java.util.Date());

        hMap.put(0, "red-apple");
        hMap.put(1, 33);

        /* 설명. Map은 key 를 통해 value 를 뽑는 것이 기본적이며, key는 객체의 동등 비교(e, h)를 통해 확인된다. */
        System.out.println("키가 \"one\"인 value값 : " + hMap.get(new String("one")));      // 키가 "one"인 value값 : Mon Feb 10 15:06:38 KST 2025
        /* 필기.
            앞서 키값으로 넣은 new Strint("one")과,
            key 값을 찾을 때 생성한 new String("one")은 서로 다른 객체이지만,
            동등 비교(equalse + hashcode) 되어 같다고 판단된다.
            반드시 equalse, hashcode 모두 오버라이딩 필요
        */

        System.out.println(hMap);
        //필기. 맵 전체는 { 키=값, ... } 으로 출력됨
//

        /* 목차. 1. key 가 중복되는 경우 */
        /* 설명. 우리가 만든 객체도 key로 사용할 수 있으며,
            이 때 해당 객체는 e, h가 반드시 오버라이딩 되어 있어야 한다. */
        hMap.put(new BookDTO(1, "홍길동전", "허균", 30000), 1);
        hMap.put(new BookDTO(2, "홍길동전", "허균", 30000), 2);

        System.out.println("BookDTO 객체를 활용한 KEY와 VALUE 쌍을 두 개 추가 후 : " + hMap);

        // Map의 키에 (equalse, hashcode를 오버라이딩하지 않은) 객체를 넣게 되면,
        // 키가 중복된다고 판단하지 못함.
        // 따라서 키가 중복되어 삽입됨

        // BookDTO에서 number값 제외, 나머지 3개 필드 값이 같으면 같은 객체로 인식하도록
        // equals, hashcode 를 오버라이딩한 후
        // 키에 같은 객체를 중복해서 삽입하면, 키가 같을 경우 덮어 씌움


        /* 목차. 2. value가 중복되는 경우 */
        hMap.put(44, 33);
        System.out.println("value가 중복되는 key와 value 쌍을 추가 후: " + hMap);
        // (키가 다르다면) value 값 중복은 허용

        /* 설명. Map을 활용해 보자. */
        Map<String, String> sMap = new HashMap<>();
        sMap.put("one", "java17");
        sMap.put("two", "mariaDB");
        sMap.put("three", "servlet/jsp");
        sMap.put("four", "springboot 3.0");
        sMap.put("five", "vue");

        System.out.println(sMap.size()); // 5
        sMap.remove("one"); // one을 키로 가진 맵 원소 삭제 (값만 삭제되는 것이 아니라, 해당 공간이 아예 삭제됨)
        System.out.println(sMap.size()); // 4

        System.out.println("sMap: " +sMap);

        sMap.clear();

        System.out.println("sMap: " +sMap);     // sMap: {}
        System.out.println(sMap.size());        // 0
        // sMap: {four=springboot 3.0, one=java17, two=mariaDB, three=servlet/jsp, five=vue}
        // key 는 Set이라고 생각하면 됨.
        // Map은 순서 보장 x

        /* 필기. Map은 Iterable 을 상속받지 않기 때문에 Iterable 사용 x (순회 불가능)
        *   KEY 를 SET으로 변경해서 Iterable 사용하기 ?!
        *   key만 알면 value를 알 수 있기 때문 !
        * */

        /* 설명. Map에 답긴 값을 순회해서 확인하는 방법
        *   => Iterator() 사용 가능한 타입으로 변환하는게 TIP
        * */
        /* 목차. 1. keySet() 을 활용해 key 를 Set으로 바꾸고, iterator를 돌리는 방법 */
        Set<String> keys = sMap.keySet();   // <String, String> 맵의 키를 Set으로 만들기
        // Set은 Iterator를 제공함.
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()){
            String key = iter.next();
//            System.out.println("key: " + key + ", value: " + sMap.get(key));
            System.out.println(sMap.get(key));
        }
//        key: four, value: springboot 3.0
//        key: one, value: java17
//        key: two, value: mariaDB
//        key: three, value: servlet/jsp
//        key: five, value: vue

        System.out.println();
        System.out.println("========EntrySet() 활용========");
        
        
        /* 목차. 2. EntrySet() 을 활용하는 방법
        *       (key와 value를 묶은 Entry 타입을 활용해 key 벗이도 value만 추출 가능)
        * */
        /*  필기. Entry(key + value 묶음) 들이 Set으로 담겨있는 것 */
        Set<Map.Entry<String, String>> set = sMap.entrySet();
        Iterator<Map.Entry<String, String>> iter2 = set.iterator();

        while(iter2.hasNext()){
            Map.Entry<String, String> entry = iter2.next();
            // Entry는 Map의 내부 인터페이스 (Map.Entry 로 접근해야 함)

//            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
            //필기. key 필요 없이 value만 추출 가능
            System.out.println(entry.getValue());
        }

//        < value 들만 추출한 경우 >
//        springboot 3.0
//        java17
//        mariaDB
//        servlet/jsp
//        vue

    }
}
