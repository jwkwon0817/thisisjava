package ch08.sec04;

public interface RemoteControl {
    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // default instance method
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리되었습니다.");
            // Using constant fields while calling abstract methods
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음이 해제되었습니다.");
        }
    }
}
