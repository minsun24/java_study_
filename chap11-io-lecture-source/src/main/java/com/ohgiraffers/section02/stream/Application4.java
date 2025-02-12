package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. FileWriter에 대해 이해할 수 있다. */
        FileWriter fw = null;
        try {
            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");

            fw.write("Hello World");
            // 영어는 자체적으로 1byte 또는 2byte로 받아들임? ??
            fw.write("한글");
            fw.write("\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try{
                if(fw != null) fw.close();
            }catch(IOException e){
                throw new RuntimeException(e);
            }
        }
    }
}
