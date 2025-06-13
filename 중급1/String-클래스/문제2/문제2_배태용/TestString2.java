public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        // 코드 작성
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ":" + arr.length);
            res+=arr[i].length();
        }
        System.out.println("sum = " + res);
    }
}