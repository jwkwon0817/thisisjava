package ch08.sec07;

public class ServiceExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언 및 구현 객체 할당
        Service service = new ServiceImpl();

        // default 메소드 호출
        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        // static 메소드 호출
        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();
    }
}
