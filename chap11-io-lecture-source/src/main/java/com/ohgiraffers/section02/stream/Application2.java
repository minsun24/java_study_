package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. FileOutputStream을 이해할 수 있다. */
        /* 설명.
        *   FileOutputStream은  FileInputStream과 달리 해당 파일이 존재하지 않으면 파일을 생성해 주며
        *   두 번째 전달인자로 true를 전달하면 기존 데이터에 이어서 출력을 내보낼 수도 있다. (이어 붙이기)
        *   한글 입출력은 못 한다.?
        * */
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt", true);

//            fos.write(97);      // a
//            fos.write('b');
//            fos.write('c');
//            fos.write('d');
            // 실행하면 파일에 abcd가 입력됨. (덮어씌워짐)
            // FileOutputStream 객체 생성할 때 append에 true 값 주면 덮어씌워지지 않고 문자열이 더해짐

            byte[] bArr = new byte[]{'a', 'p', 'p', 'l', 'e'};
            for(byte b: bArr) {
                fos.write(b);
            }
            fos.write(bArr);
//            fos.write('민');   // 에러 남

            fos.write(bArr, 2, 3);  // bArr배열에서 2번인덱스부터 3개 보내라.
        } catch (FileNotFoundException e) {
            System.out.println("경로에 파일이 없어요.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            try {
                if (fos != null) { fos.close(); }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
