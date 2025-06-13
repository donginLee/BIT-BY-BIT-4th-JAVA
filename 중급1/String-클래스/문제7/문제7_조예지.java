/* 
문자의 양쪽 공백을 제거해라. 예) " Hello Java " "Hello Java"
*/

package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = " Hello Java ";

        System.out.println(original.strip());
    }
}