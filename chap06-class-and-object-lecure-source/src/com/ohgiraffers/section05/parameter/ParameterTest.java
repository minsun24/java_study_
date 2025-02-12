package com.ohgiraffers.section05.parameter;

import java.util.concurrent.atomic.AtomicReference;

public class ParameterTest {


    //
    public void testPrimitiveTypeParameter(int num) {
        num = 10;
        System.out.println("매개변수로 전달받아 수정한 값 : " + num);
    }

    //public void testPrimitiveTypeParameter(int[] iArr){
//    public void testPrimitiveTypeParameter(Rectangle rectangle){
    public void testPrimitiveTypeParameter(AtomicReference<int[]> ref){
//        iArr[0] = 100;
//        rectangle.setHeight(11);

        ref.set(new int[]{100, 2, 3, 4, 5});

        System.out.println("메소드 내에서 수정 후");

    }

    public void testVariableLengthArrayParmeter(String[] strings) {
    }

    public void testVariableLengthArrayParamter(String 유관순, String 볼링) {
    }
}
