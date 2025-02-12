package ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{
    // product +a
    private String cpu;
    private int hdd;
    private int ram;
    private String operatingSystem;

    public Computer() {
        super();
    }


    public Computer(String operatingSystem, int ram, int hdd, String cpu) {
        super();
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public Computer(String code, String brand, String name, int price, Date manufactureDate, String cpu, int hdd, int ram, String operatingSystem) {
        super(code, brand, name, price, manufactureDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    // getter & setter
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operatingSystem='" + operatingSystem + '\'' +
                "} "
//                + super.toString()   // 부모 객체의 필드까지 반환해줌
                // 그냥 super.toString() 으로 출력해주면, Computer{컴퓨터필드...  } Product{프로덕트 필드... } 이런 형태로 출력됨.
                // 부모의 get, set에 접근할 수 있음
                + super.getCode() + super.getBrand() ;


    }

//  자식 클래스의 필드만 출력하는 toString() 메서드
//    @Override
//    public String toString() {
//        return "Computer{" +
//                "cpu='" + cpu + '\'' +
//                ", hdd=" + hdd +
//                ", ram=" + ram +
//                ", operatingSystem='" + operatingSystem + '\'' +
//                '}';
//    }
}
