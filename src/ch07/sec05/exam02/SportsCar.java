package ch07.sec05.exam02;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }

    // 오버라이딩을 할수 없음 (stop() 메소드가 final로 정의되어있기 때문이다.)
    /*
    @Override
    public void stop() {
        System.out.println("스포츠카를 멈춥니다.");
        speed = 0;
    }
    */
}
