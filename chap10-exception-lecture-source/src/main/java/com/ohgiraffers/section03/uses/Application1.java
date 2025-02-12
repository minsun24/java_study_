package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 예외처리를 많이 사용하는 io 패키지와 관련된 try-catch 구문을 이해할 수 있다. */
        /* 설명.
        *   예외 처리를 가장 많이 사용하ㅔ 되는 상황(io패키지 관련)에서 try-catch 구문을 실제 상황과
        *   유사하게 연습해보자.
        *   (아직 배우지 않았으니, 입출력 관련 구문을 하나하나 신경쓰기보다는 전체 흐름과 구조에 신경쓰자.)
        * */

        /* 설명. 입출력 (io-input/output)
            input ->(stream 통로)-> java application ->(stream 통로)-> output
              콘솔 입출력
              파일(file) 입출력을 해보자. *****
        */
        // 예외 처리를 해야지, 통로를 생성할 수 있다?
        // 통로 삭제해줘야 한다?
        //

        /* 설명. 프로젝트 바로 아래 경로에 test.dat 파일이 있다면
                그걸 인지한 File 객체를 생성해 절대 경로를 출력 */
        System.out.println(new File("test.dat").getAbsoluteFile());
        // 수동으로 파일 생성 필요
        // 생성되어 있는 파일 토대로, 파일에 맞는 자바 객체 생성
        // new File(파일명) 파일 객체 생성자
        // 파일.getAbsoluteFile() - 파일 절대경로 반환


        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(new File("test1.dat")));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally{

            /* 설명.
            *   예외처리 구문과 상관없이 반드시 수행해야 하는 경우 finally에 작성하는데,
            *   보통은 사용한 자원(resource)를 반납하는 용도로 사용하게 된다.
            * */

            try {
                if(br != null)
                    /* 설명.
                        입출력에서 사용한 스트림(통로)를 닫아주는 용도의 메서드
                        스트림이 없을 때(null)을 고려하고 IOException을 처리해야 제대로 쓸 수 있다.
                    */
                    br.close(); // stream(통로)을 닫아주어야 함.
            } catch (IOException e) {
                throw new RuntimeException(e);
                // JVM 으로 던져짐
                // main head 옆에 throws RuntimeException이 생략되어 있는 것이라 생각하면 됨.

            }
        }
    }
}
