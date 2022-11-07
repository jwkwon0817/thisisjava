package ch05.sec05;

public class CharAtExample {

    public static void main(String[] args) {

        String ssn = "0808173012345";
        char sex = ssn.charAt(6);

        switch(sex) {
            case '1':
            case '3':
                System.out.println("[성별] 남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("[성별] 여자입니다.");
                break;
        }

    }

}
