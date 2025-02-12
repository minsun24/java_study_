package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {
    /* 설명.
        자식 클래스에서 처리 가능한 예외 클래스는
        부모 메소드에 정의된 예외 처리와 동급이거나 하위 클래스여야 한다.
    *    */
    /* 설명. 부모 메소드이 예외 클래스와 같은 레벨일 땐 문제 X *
    @Override
    public void mehod() throws IOException {}
     */

    /* 설명. 부모 메서드와 달리, 예외를 발생시키지 않아도 문제 x*/
//    @Override
//    public void method()  {
//    }

    /* 설명. 부모 메소드보다 더 낮은 레벨(자식 예외 클래스)를 발생시켜도 문제 X */
//    @Override
//    public void method() throws FileNotFoundException {
//    }

    /* 설명. 부모 메소드보다 더 높은 레벨(부모 예외 ㅋ르래스)를 발생시키면, 문제 O(컴파일 에러 발생)*/

//    @Override
//    public void method() throws Exception{
//
//    }


}
