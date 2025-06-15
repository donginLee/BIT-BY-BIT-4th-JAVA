/* 
str 에서 key 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
indexOf() 를 반복문과 함께 풀면 된다.
*/

package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int lastIdx = 0;

        while (true) {
            lastIdx = str.indexOf(key, lastIdx + 1);

            if (lastIdx == -1) {
                break;
            }
            
            count++;
        }
        
        System.out.println("count = " + count);
    }
}