package ch07.sec06.package1; // 같은 패키지

public class B {

    // 메소드 선언
    public void method() {
        A a = new A(); // O
        a.field = "value"; // O
        a.method(); // O
    }

}
