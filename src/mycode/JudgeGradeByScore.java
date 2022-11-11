package mycode;

import java.util.Scanner;

public class JudgeGradeByScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = true;

        System.out.println("종료하려면 \"quit()\"을 입력하세요.");
        System.out.println("---------------------------------");

        while (stop) {
            System.out.println("당신의 점수 >>> ");
            String score = scanner.next();
            int score_int = Integer.parseInt(score);

            if ((0 <= score_int) & (score_int <= 100)) {
                char grade = (score_int > 90) ? 'A' : ((score_int > 80) ? 'B' : 'C');
                System.out.println("당신의 점수는 " + score + "점이므로 " + grade + " 등급입니다.");
                System.out.println("---------------------------------");
            } else {
                System.out.println("시험 점수를 0~100점 사이로 입력해주세요.");
            }

            if (score.equals("quit()")) {
                stop = false;
            }
        }

        System.out.println("[ 종료 ]");
    }
}