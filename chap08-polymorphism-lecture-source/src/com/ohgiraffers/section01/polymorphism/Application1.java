package com.ohgiraffers.section01.polymorphism;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 다형성과 타입 형변환에 대해 이해할 수 있다. */
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.cry();
        animal.run();

        System.out.println();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        tiger.cry();
        tiger.run();
        tiger.bite();

        System.out.println();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.sleep();
        rabbit.cry();
        rabbit.run();
        rabbit.jump();

        /* 설명. 다형성 - 하위 타입을 상위 타입으로 다룰 수 있음 */
        Animal an1 = new Animal();  // 다형성 x
        Animal an2 = new Rabbit();  // 다형성 O
        Animal an3 = new Tiger();   // 다형성 O

        /* 설명. Animal은 Tiger난 Rabbit이 아니다. (Tiger 또는 Rabbit 타입을 지니고 있지 않다.) */
//        Tiger t1 = new Animal();    // 다형성 x : 부모 -> 자식으로 타입변환 불가능 .

        System.out.println(" ===== 다형성 예제 ===== ");

        /* 설명. 동적 바인딩 확인하기
            컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가,
            런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩 되어 바뀌는 동작을 의미
            (동적 바인딩의 조건 : 상속, 다형성, 오버라이딩)
            ** 정적 바인딩
                실행 이전에는 아직 객체가 생성되기 전이기 때문에 an2, an3 는 모두 Animal을 가리킴(Animal로 인식)
            ** 동적 바인딩 (런타임 시점)
                실행 시점 이후에 어떤 객체인지 알 수 있기 때문에, 원래 객체와 연결됨.
                오버라이딩이 기본적으로 필요하다(?)
        * */

        an1.cry();      // Animal 객체 // 동물이 울음소리를 냅니다.
        an2.cry();      // Rabbit -> Animal 객체
        an3.cry();      // Tiger -> Animal 객체
//        an3.bite();     // 에러. Cannot resolve method 'bite' in 'Animal'


        /* 설명. 부모 타입을 강제로 자식 타입으로 형변환 하는 것이 가능하다. (단, 조심해야 한다.) */
        /* 설명. instanceof란 ?
        *       해당 객체의 타입을 런타임 시점에 확인하기 위한 연산자
        *  */
//        ((Tiger)an2).bite() ;       // an2를 Tiger 객체로 변환함
//        ((Rabbit)an3).jump();

        // 컴파일 시점에 알 수 있도록 an2에 담긴 객체가 Tiger 인지 확인
        // runtime 시점의 ClassCastException 방지를 위한 것
        if(an2 instanceof Tiger){
            ((Tiger)an2).bite();
        }
        if(an3 instanceof Rabbit){
            ((Rabbit)an3).jump();
        }
        if(an3 instanceof Animal){
            System.out.println("Animlal은 맞지  ~ ");
        }

        Animal animal2 = new Tiger();   // 다형성을 적용, 자동 형변환 (auto up-casting), 묵시적 형변환
        Rabbit rabbit2 = (Rabbit) an3;  // 다형성 적용 X, 강제 형변환 (down-casting), 명시적 형변환




    }
}
