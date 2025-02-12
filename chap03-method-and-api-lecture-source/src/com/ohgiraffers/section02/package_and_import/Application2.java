package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;  //
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. import 에 대해 이해할 수 있다. */

        Calculator cal = new Calculator();
        int result = cal.minNumberOf(100, 20);
        System.out.println("result = " + result);

        System.out.println("result = " + result);
    }
}
