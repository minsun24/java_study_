package com.ohgiraffers.section04;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 문자열을 다양한 기본 자료형으로 바꿀 수 있다.  ***** */
        // Wrapper 클래스에서 static 메소드로 제공됨 .

        /* 설명. Type.valueOf(str"") 의 경우, Wrapper객체를 반환 -> auto unboxing을 거쳐서 기본자료형으로 변환됨.
        *       parseType()보다 절차가 더 많음*/
        byte b = Byte.valueOf("1");
        System.out.println("b = " + b);
        short s = Short.valueOf("1");
        System.out.println("s = " + s);
        int i = Integer.valueOf("1");

        System.out.println("i = " + i);
        long l = Long.valueOf("1");
        System.out.println("l = " + l);
        float f = Float.valueOf("1");
        double d = Double.valueOf("1");
        System.out.println("d = " + d);
        boolean isTrue = Boolean.valueOf("true");
        char c = "abc".charAt(0);   // Character는 메소드가 제공되지 않아 String의 CharAt() 을 활용


        // 설명. Type.valueOf("str")보다 Type.parseType("str")이 속도면에서 간소한 차이로 더 빠름
//         설명. 반환형이 바로 기본자료형이라, 오토 언박싱을 거치지 않아 비교적 속도가 빠르다.

        byte b2 = Byte.parseByte("1");
        short s2 = Short.parseShort("1");
        int i2 = Integer.parseInt("1");
        long l2 = Long.parseLong("1");
        float f2 = Float.parseFloat("1");
        double d2 = Double.parseDouble("1");
        boolean isTrue2 = Boolean.parseBoolean("true");
        char c2 = "abc".charAt(0);   // Character는 메소드가 제공되지 않아 String의 CharAt() 을 활용


    }
}
