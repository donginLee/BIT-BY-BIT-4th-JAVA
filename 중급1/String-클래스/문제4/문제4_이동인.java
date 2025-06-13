public class Main {
    public static void main(String[] args){
        String str = "hello.txt";
        int idx = str.indexOf(".txt");
        System.out.println("filename = "+str.substring(0,idx));
        System.out.println("extname = "+str.substring(idx,str.length()));
        //확장자는 영어로 file extension
        
    }
}