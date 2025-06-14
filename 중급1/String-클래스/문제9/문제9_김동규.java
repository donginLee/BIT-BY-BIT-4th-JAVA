public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] sep = email.split("@");
        System.out.println("ID: " + sep[0]);
        System.out.println("Domain: " + sep[1]);
    }
}