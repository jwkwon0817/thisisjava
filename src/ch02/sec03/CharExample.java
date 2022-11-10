package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';      // 문자 저장
        char c2 = 65;       // 유니코드 직접 저장
        char c3 = '가';      // 문자 저장
        char c4 = 44032;        // 유니코드 직접 저장

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // 변수의 초기화를 목적으로 ''를 연달아 붙인 공백 변수를 만들 시
        // 빈 문자를 대입했으므로 컴파일 에러가 발생한다.
        /* char c = ''; */      // 컴파일 에러
        /* char c = ' '; */     // 공백 하나를 포함해서 초기화
    }
}
