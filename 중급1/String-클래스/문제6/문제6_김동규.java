public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = 0;

        while (true) {
            index = str.indexOf(key, index);
            if (index != -1) {
                count++;
                index += key.length();
            } else {
                break;
            }
        }

        System.out.println("count = " + count);
    }
}