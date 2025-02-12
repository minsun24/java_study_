package com.ohgiraffers.section04;

public class Application3 {
    public static void main(String[] args) {

        /* 설명. 기본 타입을 String 으로 변환하는 방법 */
        String b = Byte.valueOf((byte)1).toString();
        String s = Short.valueOf((short)2).toString();
        String s2 = Integer.valueOf((int)3).toString();
        String s3 = Long.valueOf((long)4L).toString();
        String s4 = Float.valueOf((float)5.0f).toString();
        String s5 = Double.valueOf((double)6.0).toString();
        String isTrue = Boolean.valueOf(true).toString();
        String ch = Character.valueOf('a').toString();

        /* 설명. "" 문자열을 더하는 연산은 문자열로 반환됨. */
        String byteStr = (byte)1 + "";      //
        System.out.println(byteStr);
    }
}
