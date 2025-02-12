package ohgiraffers.section02.superkeyword;



import ohgiraffers.section03.overriding.SuperClass;

public class SubClass extends SuperClass {

    /* 설명. 부모 메소드의 헤드부와 일치하게 오버라이딩 */
//    @Override
//    public void method(int num){
//
//    }

    /* 설명. 메소드 이름을 변경하면 안된다.
    *   (feat. 새로운 메소드를 생성한 셈) */
//    @Override   error. Method does not override method from its superclass
    public void method1(int num){}

    /* 설명. 메소드의 반환형(리턴 타입) 변경 */
//    @Override error.부모 메소드와 반환형이 달라서 에러 발생
//    public String method(int num){
//        return "hello";
//    }

    /* 설명. 경우에 따라서는 메소드의 반환형을 달리 해도 오버라이딩이 성립한다.
    *   (부모 메소드 리턴 타입의 자식 타입으로는 가능)
    *   오버라이딩 할 대상의 반환형이 Object 일 경우, 아무 반환형이나 가능
    * */
    @Override
    public SubClass method2(int num){   // 반환형 String...도 가능
        return null;
    }


//    @Override   // Method does not override method from its superclass
    /* 설명. 부모 메소드가 private일 경우, 오버라이딩 불가.  */
//    private void privateMethod(){}


    /* 설명. final 메소드는 오버라이딩 불가.  */
//    @Override 에러.  overridden method is final
//    public final void finalMethod(){};

    /* 설명. 다른 패키지더라도 상속관계이므로, 오버라이딩 성립 */
    @Override
    public void protectedMethod(){}
    // protected 인 메소드를 더 큰 범위의 접근제한자로 변경해서 오버라이딩 할 수 있다.

    /* 설명. 다른 패키지가 되면 오버라이딩 불가 */
//    @Override 에러. Method does not override method from its superclass
    void defaultMethod(){}

}
