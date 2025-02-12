package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        System.out.println(("main()이 시작됨 ..."));

        /* 설명. non-static 메서드일 경우, 메서드를 new연산자로 인지시켜 호출할 수 있다. */
        // non-static 메서드를  사용하 때는
        // 어느 클래스인지? 선언 후 사용해야 한다.
        Application2 app = new Application2();
        app.methodA();;
        app.methodB();

        System.out.println(("main()이 종료됨 ..."));
    }
    public void methodA(){
        System.out.println("methodA() 호출됨 ....");
        System.out.println("methodA() 호출됨 ....");
    }

    public void methodB(){
        System.out.println(" mehodB() 호출됨 ...");
        System.out.println(" mehodB() 종료됨 ...");
    }
}
