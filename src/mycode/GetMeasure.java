package mycode;

import java.util.Scanner;

public class GetMeasure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 입력 >>> ");
        String strN = scanner.nextLine();
        int n = Integer.parseInt(strN);

        System.out.println(n + "의 약수들: ");

        for( int i=1; i<=n; i++ ) {
            if( n%i==0 ) {
                System.out.print(i + " ");
            }
        }

    }

}