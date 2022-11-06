package ch04.sec03;

public class SwitchExpressionsExample {

    public static void main(String[] args) {

        char grade = 'B';

        switch(grade) {
            case 'A', 'a' -> {
                System.out.println("[정보] 우수 회원입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("[정보] 일반 회원입니다.");
            }
            default -> {
                System.out.println("[정보] 손님입니다.");
            }
        }

        // { } 안에 실행문이 하나만 있을 경우에는 { }를 생략할 수 있다.
        switch(grade) {
            case 'A', 'a' -> System.out.println("[정보] 우수 회원입니다.");
            case 'B', 'b' -> System.out.println("[정보] 일반 회원입니다.");
            default -> System.out.println("[정보] 손님입니다.");
        }

    }

}
