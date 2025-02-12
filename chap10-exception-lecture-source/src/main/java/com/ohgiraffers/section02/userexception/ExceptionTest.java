package com.ohgiraffers.section02.userexception;

// 임의로 처리한 예외 객체들
import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
//     public void checkEnoughMoney(int price, int money) throws Exception {
    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException{
        if(price < 0){
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }
        if(money < 0){
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }
        if(money < price){
            throw new NotEnoughMoneyException("가진 돈보다 상품 가격이 더 비쌉니다. ");
        }

        /* 설명. 아무런 예외가 발생(throw)하지 않으면 실행되는 구문 */
        System.out.println("가진 돈이 충분하신군요 고객니!ㅁ!! ");

    }
}
