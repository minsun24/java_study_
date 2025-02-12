package com.ohgiraffers.section02.set.run;

import java.util.Arrays;

public class Application3New {
    public static void main(String[] args) {
        int[] arr = new int[6];


        for(int i=0; i<arr.length; i++){
            arr[i] = (int) (Math.random() * 45) + 1;
//            System.out.println("난수 배열: " + Arrays.toString(arr));
            /* 설명. 이전 생성된 값들과 비교 */
            i = duplicateValidation(i, arr);
        }
        System.out.println("배열에 담긴 값: " + Arrays.toString(arr));
    }


    // 중복 제거
    private static int duplicateValidation(int current, int[] arr) {
        for (int j = 0; j < current; j++) {
            if (arr[current] == arr[j]) {
                current--;
                break;
            }
        }
        return current;
    }

}
