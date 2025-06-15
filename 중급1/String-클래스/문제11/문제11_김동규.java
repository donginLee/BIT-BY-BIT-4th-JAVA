public class StringTest11 {

    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder sb = new StringBuilder();
        String answer = sb.append(str).reverse().toString();

        System.out.println(answer);
    }
}