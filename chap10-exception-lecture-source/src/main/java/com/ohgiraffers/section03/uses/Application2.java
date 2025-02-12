package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표. try-with-resource 구문을 이해하고 활용할 수 있다.
            (feat. finally 안 씀) */

        // 받아야 할 자원을 try() 안에
        // 원래 finally에서 br.close() 해줘야 하는데,
        // Java7 부터 try-with-resource 를 사용하면 알아서 close 해 준다.
        try(BufferedReader br = new BufferedReader(new FileReader("test.dat"))){

        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
