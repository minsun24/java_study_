package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
    private static EagerSingleton eager = new EagerSingleton();

    // 생성자를 private으로
    private EagerSingleton() {

    }
    public static EagerSingleton getInstance() {
        return eager;
    }
}
