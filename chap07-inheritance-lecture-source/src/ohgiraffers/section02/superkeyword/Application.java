package ohgiraffers.section02.superkeyword;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. super. 과 super() 에 대해 이해할 수 있다. */
        /* 설명.
        *   super. : 자식 클래스 타입의 객체가 생성될 때 먼저 생성된 부모 클래스 타입의 객체의 주소값(참조값)을 통해 접근
        *   super() : 부모로부터 물려 받지 못한 부모 클래스에 있는 생성자를 활용하기 위해 사용
        * */

        Product p1 = new Product();
        System.out.println(p1);
        // 초기값을 부여하지 않아서, null 로 초기화
        // Product{code='null', brand='null', name='null', price=0, manufactureDate=null}

        Product p2 = new Product("p01", "플레이데이터", "자바", 1000, new java.util.Date());
        System.out.println(p2);
        // Product{code='p01', brand='플레이데이터', name='자바', price=1000, manufactureDate=Tue Feb 04 10:21:29 KST 2025}

        Computer c1 = new Computer();
        System.out.println(c1);

        Computer c2 = new Computer("퀄컴 스냅드래곤",  512, 16, "안드로이드");
        System.out.println(c2);

        Computer c3 = new Computer("p02", "구글", "픽셀", 10000000, new java.util.Date(), 
                "퀄컴 드래곤", 1024, 32, "윈도우");
        System.out.println(c3);

//      부모 클래스에 속하는 필드까지 출력됨.
//        Computer{cpu='null', hdd=0, ram=0, operatingSystem='null'} Product{code='null', brand='null', name='null', price=0, manufactureDate=null}
//        Computer{cpu='안드로이드', hdd=16, ram=512, operatingSystem='퀄컴 스냅드래곤'} Product{code='null', brand='null', name='null', price=0, manufactureDate=null}
//        Computer{cpu='퀄컴 드래곤', hdd=1024, ram=32, operatingSystem='윈도우'} Product{code='p02', brand='구글', name='픽셀', price=10000000, manufactureDate=Tue Feb 04 10:24:31 KST 2025}

    }
}
