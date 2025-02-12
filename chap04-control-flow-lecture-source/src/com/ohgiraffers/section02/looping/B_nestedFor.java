package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    /* 수업목표. 중첩 for문 활용 */

    /* 설명. 2단 ~ 9단 구구단 출력 */
    public void printGugudanFromTwoToNine() {

//        for(int i=2; i<=9; i++){
//            System.out.println("----------" + i + "단" + "----------");
//            for(int j=1; j<=9; j++){
//                System.out.println(i + " * " + j + " = " + i*j);
//            }
//            System.out.println();
//        }
        /* 설명. 메소드로 분리 */
        for(int i=2; i<=9; i++) {
            System.out.println("----------" + i + "단" + "----------");
            printGugudanOf(i);
            System.out.println();
        }
    }

    /* 설명. 단을 넘겨주면 해당 단수의 구구단을 출력하는 메소드 */
    private static void printGugudanOf(int i) {
        for(int j=1; j<=9; j++){
            System.out.println(i + " * " + j + " = " + i *j);
        }
    }

    /* 설명.
     *   아래와 같은 별모양이 나오도록 작성해보자. */
    public void printStars() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하시오. : ");
        int input = sc.nextInt();

        for(int i=0; i<input; i++){
            /* 설명. 공백 찍기 */
            printSpace(input, i);

            /* 설명. 별 찍기 */
            printStar(i);

            System.out.println();
        }

        // str.repeat(반복할 개수)
//        for (int i = 1; i <= input; i++) {
//            System.out.println(" ".repeat(input-i) + "*".repeat(i));
//        }

    }
    
    // 같은 B_nestedFor에서 사용되는 메서드이기 때문에 non-static 이어도 됨.
    private void printStar(int row) {
        for(int j = 0; j<(row +1); j++){
            System.out.print("*");
        }
    }

    private void printSpace(int input, int row) {
        for(int j = 0; j< input -(row +1); j++){
            System.out.print(" ");
        }
    }


}
