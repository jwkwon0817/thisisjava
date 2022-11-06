package ch04.sec03;

public class SwitchCharExample {

    public static void main(String[] args) {

        char grade = 'a';

        switch(grade) {
            case 'A':
            case 'a':
                System.out.println("[정보] 우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("[정보] 일반 회원입니다.");
                break;
            default:
                System.out.println("[정보] 손님입니다.");
        }

    }

}
