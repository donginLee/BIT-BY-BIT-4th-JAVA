import java.time.LocalDateTime;

public class 문제1_박수영 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2025,6,8,0,0,0);
        LocalDateTime nextTime = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);

        System.out.println("dateTime = " + dateTime);
        System.out.println("nextTime = " + nextTime);
    }
}