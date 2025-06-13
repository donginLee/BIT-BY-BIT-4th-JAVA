
public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        // 코드 작성
        String parts[] = fruits.split(",");

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
        System.out.println("joinedString = " + String.join("->",parts));

    }
}
