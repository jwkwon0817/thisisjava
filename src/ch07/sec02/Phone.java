package ch07.sec02;

public class Phone {
    // 필드 선언
    public String model;
    public String color;

    // 메소드 선언
    public void bell() {
        System.out.println("The bell rings.");
    }

    public void sendVoice(String message) {
        System.out.println("나: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊었습니다.");
    }
}
