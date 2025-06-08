public class Main {
    public static void main(String[] args){
        String str = "100";
        Integer int1 = Integer.parseInt(str);
        int int2 = int1;
        Integer int3 = int2;
        System.out.println(int1+" "+int2+" "+int3);
    }
}