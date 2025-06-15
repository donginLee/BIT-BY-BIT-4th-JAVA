public class 문제2_박수영{
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.5"};
        double tot = 0;
        for (String s : array) {
            double d = Double.parseDouble(s);
            tot += d;
        }
        System.out.println("tot = " + tot);


    }
}