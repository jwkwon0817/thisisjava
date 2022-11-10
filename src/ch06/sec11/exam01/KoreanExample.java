package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        // 객체 생성 시 주민등록번호와 이름 전달
        Korean k1 = new Korean("123456-123456", "권자바");

        // 필드값 읽기
        System.out.println("국적: " + k1.nation);
        System.out.println("주민등록번호: " + k1.ssn);
        System.out.println("이름: " + k1.name);

        // Final 필드는 값을 변경할 수 없음.
        // k1.nation = "USA";
        // k1.ssn = "123-12-1234";

        // final이 아닌 필드는 값 변경 가능
        k1.name = "김자바";
        System.out.println("개명된 이름: " + k1.name);
    }
}
