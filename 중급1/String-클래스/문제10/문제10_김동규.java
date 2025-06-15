public class SpringTest10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] fruits_arr = fruits.split(",");
        String joinedString = String.join("->", fruits_arr);

        for (String fr : fruits_arr) {
            System.out.println(fr);
        }
        System.out.println("joinedString = " + joinedString);
    }
}