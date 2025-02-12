package com.ohgiraffers.section06.statickeyword;

public class StaticTest {
    /* 수업목표. 클래스 - 인스턴스 - 지역 변수  */

    /* 설명. static, non-staitc 필드의 저장 공간이 서로 다른 것을 인지해야 함. */
    // 각 필드는 모두 0으로 초기화 됨.
    private int nonStaticCount;     // 인스턴스 변수 : 인스턴스마다 고유의 값
    private static int staticCount; // 클래스 변수 : 모든 인스턴스가 공유하는 유일한 값

    public StaticTest() {
    }

    /* 설명. static 필드와 관련된 메소드들에 static을 명시해준다.  */
    /* 설명. getter */
    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        return staticCount;
    }

    /* 설명. 각 필드 증가 메소드 */
    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }
    public void increaseStaticCount() {
        StaticTest.staticCount++;   // static 변수이기 때문에 ., 클래스명으로 접근
    }
}
