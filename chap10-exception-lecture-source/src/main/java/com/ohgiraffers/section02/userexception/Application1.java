package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 사용자 정의형 예외 클래스 정의 후 발생한 사용자 예외들을 처리할 수 있다. */
        /* 설명.
        *   catch 블럭은 이어서 여러 개를 쓸 수 있다. (예외 처리를 달리 하고자 할 때)
        *   catch 블럭에서 에외가 발생하면 catch 블럭들은 순차적으로 실행되며
        *   이 때 부모 예외 클래스가 먼저 작성되면 이후 catch 블럭은 실행되지 않을 수 있으므로
        *   자식 예외 클래스의 catch 구문을 먼저 작성해야 한다.
        *  */


        ExceptionTest et = new ExceptionTest();

        try{
            et.checkEnoughMoney(30000, 40000);
//            et.checkEnoughMoney(4000, 1000);
            et.checkEnoughMoney(-4000, -1000);  // 상품 가격은 음수일 수 없습니다.

        /* 설명. 각각의 예외 상황을 다르게 처리해주는 것 */
        }catch(PriceNegativeException e){
            System.out.println(e.getMessage());
        }catch(MoneyNegativeException e){
            System.out.println(e.getMessage());
        }catch(NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            /* 설명. 미리 정의하지 않은 예외 중 추가적인 에러가 발생할 때 -> */
            System.out.println("어떤 예외든 다 잡아줌!");
            System.out.println("어떤 예외든 메시지는: " + e.getMessage());
        }

    }
}
