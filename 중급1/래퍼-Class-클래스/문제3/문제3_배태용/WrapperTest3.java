public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        // 코드 작성
        Integer i = Integer.valueOf(str);
        System.out.println("integer1 = " + i);
        int i1 = i.intValue();
        System.out.println("intValue = " + i1);
        Integer i2 = Integer.valueOf(i1);
        System.out.println("integer2 = " + i2);
    }
}