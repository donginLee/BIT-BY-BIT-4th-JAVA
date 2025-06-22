public class MyDateMain {
    public static void main(String[] args) {
        MyDate date = new MyDate(2025,6,8);

        date = date.changeDay(15);
        System.out.println("date = " + date);
    }
}