package ohgiraffers.section03.overriding;

/* 설명.
*   클래스의 접근 제어자 (2 가지로 제한)
*   1. public
*   2. default
* */
public class SuperClass {

    /* 수업목표. 오버라이딩에 대해 이해할 수 있다. */
    public void method(int num){}

    public Object method2(int num){
        return null;
    }
    /* 설명. 멤버(필드/메소드)의 접근 제어자 4가지
        ... 정리 필요 ...
    *   1. public - 다 접근 가능
    *   2. protected - 다른 패키지에 있더라도, 상속 관계이면 접근 가능 / 다른 패키지이면서, 상속 관계 아닐 경우 접근 불가능
    *   3. private - 같은 패키지 내에서
    *   4. default
    * */
    private void privateMethod(){}

    public final void finalMethod(){}   // final 키워드 : 마지막 메소드 ? -> 오버라이딩 불가능

    protected void protectedMethod(){}

    void defaultMethod(){}



}
