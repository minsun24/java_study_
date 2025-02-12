package com.ohgiraffers.section02.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 문자열 분리에 대해 이해하고 적용할 수 있다. */

        /* 설명.
        *       문자열을 특정 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
        *       1. split() : 정규표현식을 이용하여 비정형화된 문자열을 분리한다.
        *                   (String을 파싱하여 String[] 로 변환해주고 [](대괄호)를 넘어줄 있다. 
        *       2. StringTokenizer : 문자열의 모든 문자들을 구분자를 활용하여 문자열이 분리 된다.
        *                   (StringTokenizer가 제공하는 메소드와 while문을 활용하여 띄어쓰기로
        *                   구분된 구분자들을 넣어줄 수 있다.)
        * */

        /* 목차. 1. split() 활용
                str.split(구분자) => 문자열 배열
        *       구분자를 기준으로 잘라내서 문자열 배열로 반환
        * */
        String emp1 = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부";
        String emp3 = "300/이순신?경기도/";   // 문자열의 마지막이 구분자일 경우, 넘어감

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("[/?]");  // 구분자를 2개 이상 사용하는 경우

        System.out.println(Arrays.toString(empArr1));   // [100, 홍길동, 서울, 영업부]
        System.out.println(Arrays.toString(empArr2));   // [200, 유관순, , 총무부]
        System.out.println(Arrays.toString(empArr3));   // [300, 이순신, 경기도]


        /* 목차. 2. StringTokenizer 활용 */
        String colors = "red, yellow, pink, green, purple? blue";
        StringTokenizer colorStringTokenizer = new StringTokenizer(colors, ", ?");  // delimiter(구분자) 2개 이상 전달 가능
        // 커서(|)가 값 앞에 위치되어 초기화
        // | red | yellow | pink | green | purple | blue

        while(colorStringTokenizer.hasMoreTokens()) {   // 커서가 맨 뒤에 위치될 경우, 다음값이 없으므로 while문을 벗어나게 됨.

            /* 설명.현재의 반복 회차 안에서 해당 토큰을 여러 번 쓰고 싶으면 변수에 담아 쓰자.  */
            String token = colorStringTokenizer.nextToken();    // 커서가 다음 값 앞으로 이동
            System.out.println(token);
            //
//            System.out.println(colorStringTokenizer.nextToken());
        }



    }
}
