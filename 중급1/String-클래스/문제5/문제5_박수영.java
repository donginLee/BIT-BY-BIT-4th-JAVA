public class 문제5_박수영 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        int extIndex = str.indexOf(ext);
        String filename = str.substring(0, extIndex);
        String extName = str.substring(extIndex);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}