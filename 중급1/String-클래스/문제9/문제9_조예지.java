/* 
문자의 양쪽 공백을 제거해라. 예) " Hello Java " "Hello Java"
*/

package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] emailSplited = email.split("@");

        System.out.println("ID: " + emailSplited[0]);
        System.out.println("Domain: " + emailSplited[1]);
    }
}