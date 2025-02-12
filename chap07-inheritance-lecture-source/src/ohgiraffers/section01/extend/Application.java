package ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 상속에 대해 이해할 수 있다. */

        // is a 관계 
        // firecar is a car 관계가 성립 : car(부모) <- firecar(자식)

        Car car = new Car();
        car.soundHorn();        // 빵 빵!
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();
//        car.sparyWater();

        System.out.println();

        /* 설명. 자식 클래스 객체 생성해보면,
        *   부모 클래스의 생성자를 먼저 실행한 후  // 부모 클래스 기본 생성자 호출됨
        *   자식 클래스의 생성자가 호출된다는 것을 알 수 있다. // FireCar 자식 클래스의 기본 생성자 호출됨...
        * */
        // 만약, 부모a <- 부모b <- 자식a 구조일 때,
        // 자식a 객체를 생성한다면, 부모 a 생성자 => 부모 b 생성자 => 자식 a 생성자 순으로 실행된다.
        // 모든 클래스의 최상위 클래스는 Object 클래스
        // 부모가 명시되어있지 않음 모든 클래스의 부모는, Object 클래스로, extends Object가 생략되어 있는 것과 같다.
        FireCar fireCar = new FireCar();
        fireCar.soundHorn();    // 빵ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ!!!!!
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        fireCar.sprayWater();   // fireCar가 추가로 가지는 메소드

        /* 설명. 상속 장단점
        *   장점
        *     재사용성 - 코드 줄 수를 줄일 수 있음
        *     오버라이딩 (= 메소드 재정의)
        *     다형성
        *   단점
        *     스파게티 코드
        * */
        System.out.println();
        RacingCar racingCar = new RacingCar();
        racingCar.run();
        racingCar.soundHorn();



    }
}
