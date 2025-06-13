/* 
replace() 를 사용해서 java 라는 단어를 jvm 으로 변경해라.
*/

package lang.string.test;

public class TestString8 {
    public static void main(String[] args) {
        String input = "hello java spring jpa java";
        
        // CKP: replace와 replaceAll의 차이
        System.out.println(input.replace("java", "jvm"));
    }
}