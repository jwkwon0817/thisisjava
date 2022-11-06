package ch04.sec02;

public class IfDiceExample {

    public static void main(String[] args) {

        // Math.random() 사용법
        // Math.random() * n + start

        int num = (int)(Math.random() * 6) + 1;

        if(num == 1) {
            System.out.println("[주사위] 1번이 나왔습니다.");
        } else if(num == 2) {
            System.out.println("[주사위] 2번이 나왔습니다.");
        } else if(num == 3) {
            System.out.println("[주사위] 3번이 나왔습니다.");
        } else if(num == 4) {
            System.out.println("[주사위] 4번이 나왔습니다.");
        } else if (num == 5) {
            System.out.println("[주사위] 5번이 나왔습니다.");
        } else {
            System.out.println("[주사위] 6번이 나왔습니다.");
        }

    }

}
