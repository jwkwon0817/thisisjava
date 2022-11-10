package ch08.sec06;

public interface RemoteControl {
    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    static void changeBattery() {
        System.out.println("리모컨 배터리를 교체했습니다.");
    }

    // 추상 메소드
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    // default 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리되었습니다.");
            // 추상 메소드 호출하면서 상수 필드 사용
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음이 해제되었습니다.");
        }
    }
}
