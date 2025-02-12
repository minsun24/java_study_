package ohgiraffers.section01.extend;

public class Car {
    private boolean runningStatus;

    public Car() {
        super();    // 부모의 생성자.
        /* 설명. 부모의 생성자는 물려받지 못한다. this*/
        System.out.println("부모 클래스 기본 생성자 호출됨");
    }

    public void soundHorn() {
        if(runningStatus){
            System.out.println("빵 빵!");}
        else{
            System.out.println("주행중이 아니라면 경적을 올릴 수 없습니다. ");
        }
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달리기 시작합니다. ");
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다!!");
    }
}
