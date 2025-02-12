package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표. 배열에 대해 이해하고 배열의 사용 목적을 이해할 수 있다. */
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
        
        int sum = 0;
        
        sum += num1; 
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = " + sum);

        int[] arr = new int[5];     // new -> heap 영역에 5칸(int라서 4byte)
        // int 기본값인 0으로 초기화됨.
        // [0, 0, 0, 0, 0]

        System.out.println("arr = " + arr);     // 주소가 나옴.
        /* 설명. [I@4dd8dc3
        *   [ (배열) I (int형) @ (at, ~에 있다.) 4dd8dc3(16진수 주솟값) */

        /* 설명. 기본자료형이 아닐 경우
        *   println() 할 때 arr.toString() 으로 보여지게 됨
        *   참조자료형은 모두 toString() 을 가짐.
        *   Objtect 클래스의 toString() ; return getClass().getName() + ... 로 인해
        * */

        System.out.println("배열의 모습을 보고 싶어 : " + Arrays.toString(arr));
        // 배열의 모습을 보고 싶어 : [0, 0, 0, 0, 0]

        for(int i=0; i<arr.length; i++){
            arr[i] = (i+1)*10;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        //  Arrays.toString(arr) = [10, 20, 30, 40, 50]

        int arrSum = 0;
        for(int i=0; i<arr.length; i++){
            arrSum += arr[i];
        }
        System.out.println("arrSum = " + arrSum);   // arrSum = 150


    }
}
