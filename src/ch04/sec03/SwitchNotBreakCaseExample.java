package ch04.sec03;

public class SwitchNotBreakCaseExample {

    public static void main(String[] args) {

        int time = (int)(Math.random()*4) + 8; // 8, 9, 10, 11 사이의 정수 뽑기
        System.out.println("[ 현재 시간: " + time + "시 ]");
        System.out.println("------------------");

        switch(time) {
            case 8:
                System.out.println("[일정] 출근합니다.");
            case 9:
                System.out.println("[일정] 회의를 합니다.");
            case 10:
                System.out.println("[일정] 업무를 봅니다.");
            case 11:
                System.out.println("[일정] 외근을 나갑니다.");
        }

    }

}
