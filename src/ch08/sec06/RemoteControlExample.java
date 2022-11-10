package ch08.sec06;

public class RemoteControlExample {
    public static void main(String[] args) {
        // Interface 변수 선언
        RemoteControl rc;

        // Television 객체를 생성하고 Interface 변수에 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

        // default 메소드 호출
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        // Audio 객체를 생성하고 Interface 변수에 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        // default 메소드 호출
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        // static 메소드 호출
        RemoteControl.changeBattery();
    }
}
