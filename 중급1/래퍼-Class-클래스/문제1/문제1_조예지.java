/* 
문자로 입력된 str1 , str2 두 수의 합을 구하자.
*/

package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        System.out.println("두 수의 합: " + (Integer.parseInt(str1) + Integer.parseInt(str2)));
    }
}