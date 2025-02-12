package ohgiraffers.section01.extend;

public class RacingCar extends Car {
    public RacingCar() {
        super();
        System.out.println("레이싱카 자식 클래스 생성자 호출! ! !");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적따위 울리지 않습니다. ");
    }

    @Override
    // 접근제어자, 반환형(Java 7버전부터 가능)이 달라도 메소드 이름 동일, 매개변수 동일하다면 오버로딩
    // 접근 제어자는 제한 규칙(?) 존재. 참고 필요.
    public void run() {
        System.out.println("레이싱 자동차가 달립니다. 쌔애애애애앵 !!~!~!!");
    }


}
