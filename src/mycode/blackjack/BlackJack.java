package mycode.blackjack;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        // create new Scanner()
        Scanner scanner = new Scanner(System.in);

        // variables
        boolean go_firstPlayer = true;
        boolean go_secondPlayer = true;
        int firstNumber = 0;
        int secondNumber = 0;
        int cardSum = 0;
        double number = 0;
        String winner = " ";

        // set nickname
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("1번 플레이어님의 닉네임을 입력해주세요.");
        System.out.print(">>> ");
        String firstPlayer = scanner.next();
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("[ 시스템 ] 1번 플레이어님의 닉네임이 " + firstPlayer + "로 설정되었습니다.");
        System.out.println();

        // block same nickname
        System.out.println("----------------------------------");
        System.out.println("2번 플레이어님의 닉네임을 입력해주세요.");
        System.out.print(">>> ");
        String secondPlayer = scanner.next();
        System.out.println("----------------------------------");

        while (secondPlayer.equals(firstPlayer)) {
            System.out.println();
            System.out.println("[ 오류 ] 1번님의 닉네임인 " + firstPlayer + "와 닉네임이 같습니다. 다른 닉네임으로 설정해주세요.");
            System.out.print(">>> ");
            secondPlayer = scanner.next();
            if (!secondPlayer.equals(firstPlayer)) {
                break;
            }
        }
        System.out.println();
        System.out.println("[ 시스템 ] 2번 플레이어님의 닉네임이 " + secondPlayer + "로 설정되었습니다.");
        System.out.println();

        // game rules
        System.out.println("=============================================================================");
        System.out.println();
        System.out.println("[ 게임 설명 ]");
        System.out.println("- 숫자는 .을 입력해 뽑을 수 있습니다.");
        System.out.println("- 숫자를 뽑고 그만하고 싶다면 \"예\", 그만하고 싶지 않다면 아무 문자나 입력해주시면 됩니다.");
        System.out.println("- 두 번째 플레이어는 자신이 이겼을 때 \"그만하실건가요?\"라는 질문에 \"예\"를 답해주셔야 승리합니다.");
        System.out.println();
        System.out.println("=============================================================================");
        System.out.println();

        System.out.println("[ 시스템 ] " + firstPlayer + "님부터 게임을 시작합니다!");
        System.out.println();

        // firstPlayer
        while (go_firstPlayer || go_secondPlayer) {
            System.out.println("[ 블랙잭 ] .을 입력하여 숫자를 뽑으세요!");
            String keepGoing = scanner.next();

            // pick new number
            if (keepGoing.equals(".")) {
                number = (int)(Math.random() * 9) + 1;
                cardSum += number;

                // block number bigger than 21
                if (cardSum > 21) {
                    switch (String.valueOf(number)) {
                        case "1":
                        case "3":
                        case "6":
                        case "7":
                        case "8":
                            System.out.println("[ 블랙잭 ] 당신이 뽑은 숫자는 " + (int) number + "이였습니다!");
                        default:
                            System.out.println("[ 블랙잭 ] 당신이 뽑은 숫자는 " + (int) number + "였습니다!");
                    }
                    System.out.println("[ 블랙잭 ] 현재 숫자는 21이 넘었기 때문에 숫자가 터졌습니다.");
                    if (go_firstPlayer) {
                        System.out.println("[ 블랙잭 ] 자동으로 " + secondPlayer + "님이 승리했습니다!");
                        winner = secondPlayer;
                    } else {
                        System.out.println("[ 블랙잭 ] 자동으로 " + firstPlayer + "님이 승리했습니다!");
                        winner = firstPlayer;
                    }
                    System.out.println();
                    break;
                }
            }

            // ask about stop
            System.out.println();
            System.out.println((int) number + "을 뽑았습니다.");
            System.out.println("현재 숫자는 " + cardSum + "입니다.");
            System.out.println();
            System.out.print("그만하실건가요? >>> ");
            String stop = scanner.next();

            if (stop.equals("예")) {
                if (go_firstPlayer) {
                    System.out.println();
                    System.out.println("[ 시스템 ] " + firstPlayer + "님이 그만두었습니다!");
                    System.out.println();
                    go_firstPlayer = false;
                    firstNumber = cardSum;
                    System.out.println();
                    System.out.println("==============================");
                    System.out.println("[ 시스템 ] " + secondPlayer + "님 차례입니다.");
                    System.out.println("==============================");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("[ 시스템 ] " +secondPlayer + "님이 그만두었습니다!");
                    System.out.println();
                    go_secondPlayer = false;
                    secondNumber = cardSum;
                    if (firstNumber > secondNumber) {
                        System.out.println(firstPlayer + "님이 이겼습니다.");
                        winner = firstPlayer;
                    } else if (firstNumber == secondNumber) {
                        System.out.println("비겼습니다!");
                        winner = "비김";
                    } else {
                        System.out.println(secondPlayer + "님이 이겼습니다.");
                        winner = secondPlayer;
                    }
                }


                cardSum = 0;
            } else {
                System.out.println();
                System.out.println("[ 블랙잭 ] 뽑기를 계속 진행합니다.");
                System.out.println();
            }
        }

        System.out.println("[ 게임 종료 ]");

        if ((firstNumber == 0) || (secondNumber == 0)) {
            if (winner == firstPlayer) {
                System.out.println(secondPlayer + "님의 숫자가 터져서 " + winner + "님이 승리하셨습니다!");
            } else if (winner == secondPlayer) {
                System.out.println(firstPlayer + "님의 숫자가 터져서 " + winner + "님이 승리하셨습니다!");
            }
        } else {
            System.out.println(firstPlayer + "님의 숫자: " + firstNumber);
            System.out.println(secondPlayer + "님의 숫자: " + secondNumber);
        }

        if (winner.equals("비김")) {
            System.out.println("[ 결과 ] 비겼습니다! (숫자: " + cardSum + ")");
        } else {
            System.out.println("[ 결과 ] " + winner + "님의 승리!");
        }
    }
}