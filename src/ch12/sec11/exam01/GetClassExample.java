package ch12.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) {
        // how 1
        Class clazz = Car.class;

        // how 2
        // Class clazz = Class.forName("ch12.sec11.exam01.Car");

        // how 3
        // Car car = new Car();
        // Class clazz = car.getClass();

        System.out.println("패키지: " + clazz.getPackageName());
        System.out.println("클래스 간단 이름: " + clazz.getSimpleName());
        System.out.println("클래스 이름: " + clazz.getName());
    }
}
