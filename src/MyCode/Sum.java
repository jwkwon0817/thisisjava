package MyCode;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("소수점 입력 시 부동 소수점에 의해서 3자리까지만 계산됩니다.");
        System.out.println("-------------------------");

        System.out.println("첫번째 숫자: ");
        String firstNum = scanner.next();
        double Num1 = Double.parseDouble(firstNum);

        System.out.println("두번째 숫자: ");
        String secondNum = scanner.next();
        double Num2 = Double.parseDouble(secondNum);

        String result = String.valueOf((Num1 + Num2));

        System.out.println("-------------------------");
        System.out.println("결과: " + Float.parseFloat(result));

    }
}
