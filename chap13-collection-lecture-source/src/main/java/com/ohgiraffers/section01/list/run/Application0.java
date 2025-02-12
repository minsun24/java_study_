package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Application0 {
    public static void main(String[] args) {

        /* 수업목표. 컬렉션 프레임워크에 대해 이해할 수 있다. */

        /*  설명.  모든 컬렉션은 제네릭 타입이면, 다이아몬드 연산자(<>)를 생략하면 <Object> 인 상태이다. */
//        ArrayList list = new ArrayList();
        List<Object> list = new ArrayList<Object>();  // List 계열은 다형성 적용 가능

        /*  설명.  데이터를 넣은 순서를 기억한다. */
        list.add("apple");
        list.add(123);
        list.add(45.76);
        list.add(new java.util.Date());
        // List는 여러 가지 타입 add 가능
        /*  필기. List는 제네릭 타입 (생략된 것) */

        /*  설명.  모든 컬렉션은 toString()이 잘 오버라이딩 되어 쉽게 출력해 볼 수 있다. */
        System.out.println(list.toString()); // Arrays.toStritn() 대신 간편하게 사용 가능
        // [apple, 123, 45.76, Sun Feb 09 00:09:08 KST 2025]

        System.out.println("첫번째 값: " + list.get(0));
        System.out.println("두번째 값: " + list.get(1));
        System.out.println("리스트에 담긴 데이터의 크기: " + list.size());

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        /*  설명.
         *    배열보다 ArrayList가 좋은 점
         *       1. 미리 크기를 할당할 필요가 없다.
         *       2. 들어있는 값의 갯수를 잘 파악할 수 있다. (.size())
         *       3. 경우에 따라(제네릭 타입을 생략하면) 다양한 값을 한번에 저장할 수 있다.
         *       4. 중간에 값을 추가 및 삭제가 용이하다. (알고리즘 구현)
         * */

        /*  설명.  2번째에 위치에 10을 끼워 넣기*/
        list.add(1, 10);
        System.out.println(list);        // 특정 위치에 값이 추가됨.

        /*  설명.  값 중복 가능 (<-> set) */
        list.add(1, 10);
        System.out.println(list);

        /*  설명.  중간 값 수정 가능 */
        list.set(0, "banana");
        System.out.println(list);

        /* 설명. 원하는 위치의 값 제거( 이후 요소들의 위치가 영향을 받음 ) */
        list.remove(0);
        System.out.println(list);
        System.out.println("처음 요소 제거 후 처음 요소: " + list.get(0));

        // =========================================================================
        /*  설명.  (추가로)
         *    컬렉션 대신 배열로 한번 중간에 값 추가 연습해 보기 */

        int[] intArr = new int[5];
        int num = 0;
        for(int i=0; i<intArr.length; i++) {
            intArr[i] = ++num;
        }

        System.out.println(Arrays.toString(intArr)); // [1, 2, 3, 4, 5]

        /* 설명. 2번째 인덱스에 7을 추가해 (기존 배열 크기 + 1)이 되는 코드 작성 */

        /*  필기. 내 풀이 */
        int[] intArr2 = new int[intArr.length+1];
        for(int i=0; i<intArr2.length; i++) {
            if(i < 1){
                intArr2[i] = intArr[i];
            }else if(i == 1){
                intArr2[i] = 7;
            }else{
                intArr2[i] = intArr[i-1];
            }
        }
        System.out.println(Arrays.toString(intArr2));   // [1, 7, 2, 3, 4, 5]

        /*  필기. 수업 풀이 */

//       for (int i = newIntArr.length - 2; i >= index; i--) {
//            newIntArr[i + 1] = intArr[i];
//       }

        int[] newIntArr = new int[intArr.length+1];
        System.arraycopy(intArr, 1, newIntArr, 2, 4);

        newIntArr[0] = intArr[0];
        newIntArr[1] = 7;

        System.out.println(Arrays.toString(newIntArr));






    }
}