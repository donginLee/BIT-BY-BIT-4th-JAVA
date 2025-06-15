public class Main {
    public static void main(String[] args){
        String original = "하파타카차자아사바마라다나가";
        StringBuilder reversed = new StringBuilder(original).reverse();
        System.out.println(reversed);
        //그런데 만약 StringBuilder -> String 형변환하려면
        // new String 써도 되지만 toString()하면 쉽게 바뀜
    }
}