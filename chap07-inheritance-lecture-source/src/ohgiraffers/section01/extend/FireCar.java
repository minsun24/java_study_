package ohgiraffers.section01.extend;

public class FireCar extends Car {

    public FireCar(){
        /* 설명. 부모로부터 생성자는 물려받지 않고, super() 를 통해 부모 객체를 먼저 생성한다. */
        super();
        System.out.println("FireCar 자식 클래스의 기본 생성자 호출됨...");
    }
    /* 설명. 부모로부터 물려받는 필드 및 메소드 외에 더 추가 가능
    *       => 따라서, 자식 클래스는 부모 클래스보다 확장된다.
    * */
    public void sprayWater() {
        System.out.println("불이 난 곳을 찾았습니다. 물을 뿌립니다. =========== 3");
    }

    // key : ctrl + 'o'
    // deprecated (?)
    /* 설명. 메소드 오버라이딩
    *       Car 부모 클래스로부터 물려 받은 메서드(soundHorn()) 를
    *       자식 클래스에서 재정의해보자.
    *
    * */
    @Override
    /* 설명.
    *   @Override 어노테이션을 사용하는 이유?
    *   1. 메소드 중에 부모로부터 물려 받아 재정의하는 메소드를 파악하기 용이하도록 (가독성 측면)
    *   2. 부모의 메소드를 오버라이딩 할 때 발생할 수 있는 실수를 방지하기 위해 (실수 방지 측면)
    * */
    public void soundHorn() {
        System.out.println("빵ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ!!!!! ");
    }


}
