public class Main {
    public static void main(String[] args){
        String str = "100";
        Integer int1 = Integer.valueOf(str);
        int int2 = int1.intValue();
        Integer int3 = Integer.valueOf(int2);
        System.out.println(int1+" "+int2+" "+int3);
    }
}