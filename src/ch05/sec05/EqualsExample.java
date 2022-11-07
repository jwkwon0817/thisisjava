package ch05.sec05;

public class EqualsExample {

    public static void main(String[] args) {

        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        // 객체로 만들어지는 String 변수가 아니라면 서로 같다.
        if(strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음.");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름.");
        }

        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음.");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        // 객체(new)로 만들어진 String 변수라면 서로 다르다.

        if(strVar3 == strVar4) {
            System.out.println("strVar3와 strVar4는 참조가 같음.");
        } else {
            System.out.println("strVar3와 strVar4는 참조가 다름.");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3와 strVar4는 문자열이 같음.");
        }

    }

}
