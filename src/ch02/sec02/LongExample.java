package ch02.sec02;

public class LongExample {

    public static void main(String[] args) {

        // int: -2,147,483,648 ~ 2,147,483,647까지 저장 가능
        // 위 범위를 초과하는 값은 l이나 L을 붙여서 long 타임 값임을 컴파일러에게 알려줘야함.
        long var1 = 10;
        long var2 = 20L;
        // long var3 = 100000000000000; // 컴파일러는 int로 간주하기 때문에 에러 발생
        long var4 = 100000000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
