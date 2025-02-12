package com.ohgiraffers.section04.comparison;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. 비교 연산자에 대해 이해하고 활용할 수 있다.  */
        /* 목차. 1. 숫자값 비교 */
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 > num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 < num2);


        System.out.println('a' > 10);   // 'a' == 97
        // 문자도 숫자로 취급 (유니코드 표 기준)


        /* 목차. 2. 논리값 비교 */
        boolean isNum1 = true;
        boolean isNum2 = false;
        System.out.println(isNum1 == isNum2);
        System.out.println(isNum1 != isNum2);
//        System.out.println(isNum1 >= isNum2);
//        System.out.println(isNum1 > isNum2);
//        System.out.println(isNum1 <= isNum2);
//        System.out.println(isNum1 < isNum2);


        /* 목차. 3. 문자열 값 비교  */
        String str1 = "java";
        String str2 = "java";
        System.out.println(str1 == str2);
        System.out.println(str1 != str2);
//        System.out.println(str1 >= str2);
//        System.out.println(str1 > str2);
//        System.out.println(str1 <= str2);
//        System.out.println(str1 < str2);

    }
}
