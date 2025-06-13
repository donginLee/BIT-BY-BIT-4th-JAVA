/* 
split() 를 사용해서 fruits 를 분리하고, join() 을 사용해서 분리한 문자들을 하나로 합쳐라.
*/

package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] splited = fruits.split(",");

        for (String s: splited) {
            System.out.println(s);
        }

        System.out.println("joinedString = " + String.join("->", splited));
    }
}