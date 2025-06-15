public class 문제10_박수영 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] splitFruits = fruits.split(",");
        for(String fruit : splitFruits) {
            System.out.println(fruit);
        }

        String joinedString = String.join("->", splitFruits);
        System.out.println("joinedString = " + joinedString);
    }
}