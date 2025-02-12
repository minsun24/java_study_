package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 사용자 지정 범위의 난수를 발생시킬 수 있다. */

        // (int)(Math.random() * 생성할 난수 개수) + 시작수
        /* 설명. 1. 0 ~9 까지의 난수 생성 */
        int random1 = (int) (Math.random() * 10);
        // random() 반환형은 double 0.0 ~ 0.9
        // (int) 로 반환값 강제형변환

        /* 설명. 2. 80 ~ 100까지의 난수 생성   */
        int random2 = (int) (Math.random() * 21) + 80;

        /* 설명. 3. -188 ~ 10 까지의 난수 생성  */
        int random3 = (int)(Math.random() * (198 + 1)) + (-188);
        // 음수, 0, 양수 개수

        System.out.println("random1 = " + random1);
        System.out.println("random2 = " + random2);
        System.out.println("random3 = " + random3);

    }
}
