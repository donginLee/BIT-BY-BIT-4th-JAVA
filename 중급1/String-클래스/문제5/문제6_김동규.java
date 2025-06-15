public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int indexOfExtStart = str.indexOf(".txt");
        String filename = str.substring(0, indexOfExtStart);
        String extName = ext;

        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}