public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        // 코드 작성
        int idx = str.indexOf(ext);
        System.out.println("filename = " + str.substring(0,idx));
        System.out.println("extName = " + str.substring(idx));
    }
}