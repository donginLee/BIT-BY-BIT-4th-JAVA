public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        // 코드 작성
        String[] parts = email.split("@");
        System.out.println("ID: " + parts[0]);
        System.out.println("Domain: " + parts[1]);
    }
}