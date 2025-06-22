public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int sum = 0;
        for (String str : arr) {
            System.out.printf("%s:%d\n", str, str.length());
            sum += str.length();
        }
        System.out.println("sum = " + sum);
    }
}