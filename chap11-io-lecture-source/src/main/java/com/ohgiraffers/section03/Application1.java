package com.ohgiraffers.section03;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표.
            BufferedWriter와 BufferedReader에 대해 이해하고 사용할 수 있다.  */

        /*  설명.
         *    내부적으로 버퍼(Buffer)를 활용해서 입출력 성능을 향상 시킨다.
         *    추가적인 메소드가 제공된다.
         * */

        /*  필기.
        *    기반 스트림의 보조 필터인 Buffered...
        *    수도꼭지 모양 변경하는 필터(?)
                BufferedWriter/Reader 는 버퍼에 담아서 한 번에 가져오거나, 가져가는 것
                * 속도 향상이 된다.
                * (입출력받을 데이터와 버퍼의 크기에 따라 효율이 달라짐)
                * DEFAULT_MAX_BUFFER_SIZE = 8192;
        * */

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(
                    new FileWriter(
                            "src/com/ohgiraffers/section03/filterstream/testBuffered.txt"));
            // 실행하면 해당 경로에 파일이 생성됨
            // 재실행 시 덮어 씌워짐
            // bw는 BufferedWriter(보조 스트림 객체)의 주소를 담고 있음.

            // 버퍼에 아래 세 줄이 담김.
            bw.write("눈이 하늘에서!");
            bw.write("펑펑\n");
            bw.write("내려오네.");
            // testBuffered.txt 에 위 내용이 적힘.
            // 버퍼를 사용해서 속도가 빠를 것이라 가정
            /*  필기.
                 원래 버퍼는 버퍼의 크기가 꽉 차지 않으면 이동하지 않는다.?
                 ex. 입력받는 버퍼 (=> 꽉 차지 않으면, 파일에 쓰지 않음)
                 그런데 위 경우는, 버퍼가 꽉 차지 않았음에도 불구하고, 파일에 문자열이 작성되었음!
                 이건, finally문 - bw.close()에서  flush()가 실행되었기 때문
                 flush() 는 아직 버퍼가 다 채워지지 않아도 버퍼를 쏟아내주는 메소드.
                 만약, finally 부분이 없다면 flush() 가 작동하지 않아서, 실행해도 파일에 작성되지 않음
                 (아직 버퍼가 채워지지 않았으므로)
            */

            // 그냥 여기에 바로 flush 를 실행해서 버퍼를 비우는 방법도 있다.

            /*  설명.
                 내부적으로 버퍼가 다 차지 않으면 출력으로 내보내 지지 않는데, flush()를 호출해야 버퍼가 비워진다. */
            bw.flush();     // 출력이 나가는 시점.


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try{
                if(bw != null){bw.close();}
                /*  필기.
                     STEAM이 2개(BufferedWriter, FileWriter)인데 close()를 하나만 해줘도 되는 건가?
                     보조 스트림(bw == BufferedWriter)를 닫으면, 보조 스트림과 관련된
                     기반 스트림(FileWriter)도 같이 닫아준다. (기반 스트림만 닫는 방법은 없다.
                     + 기반스트림을 따로 변수에 담아서 사용하는 경우에도 추가적인 close() 필요 없음. )
                */
            }catch(IOException e){
                throw new RuntimeException(e);
            }
        }


        // 작성한 내용을 파일로부터 다시 읽어오기
        BufferedReader br = null;
        try {
            br = new BufferedReader((
                    new FileReader("src/com/ohgiraffers/section03/filterstream/testBuffered.txt")
            ));
            // 파일의 끝을 인지하는 방법 (EOF End OF file)
//            String str = br.readLine(); // 한 줄씩 읽어서 string으로 반환해주는 것
//            System.out.println("str= " + str); // 파일의 맨 처음 한 줄만 출력됨.

            /*  필기.
             *    null if the end of the stream 파일이 끝이면 null 을 반환 ?
             *    EOF 까지, 모든 내용 출력하기
             * */
            String str = "";
            while((str = br.readLine()) != null){   // 문자열을 한 줄 먼저 읽어서, null인지 판별하고
                System.out.println("str = " + str); // null이 아니면, 읽은 문자열을 출력한다.
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            try{
                if(br != null){br.close();}

            }catch(IOException e){
                throw new RuntimeException(e);
            }
        }


    }
}