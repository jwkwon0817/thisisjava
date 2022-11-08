package mycode;

import java.util.Scanner;
import java.math.BigDecimal;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------");

        System.out.println("첫번째 숫자: ");
        String firstNum = scanner.next();
        BigDecimal Num1 = new BigDecimal(firstNum);

        System.out.println("두번째 숫자: ");
        String secondNum = scanner.next();
        BigDecimal Num2 = new BigDecimal(secondNum);

        String result = String.valueOf(Num1.add(Num2));

        System.out.println("-------------------------");
        System.out.println("결과: " + Float.parseFloat(result));

    }
}
