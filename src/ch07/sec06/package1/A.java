package ch07.sec06.package1;

// 접근 제한자: protected
// 제한 대상: 필드, 생성자, 메소드
// 제한 범위: 같은 패키지이거나, 자식 객체만 사용 가능

public class A {

    // 필드 선언
    protected String field;

    // 생성자 선언
    protected A() {
    }

    // 메소드 선언
    protected void method() {
    }

}
