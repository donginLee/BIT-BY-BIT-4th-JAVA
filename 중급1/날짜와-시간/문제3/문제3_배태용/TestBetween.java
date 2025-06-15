import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        // 코드 작성
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

        Period period = Period.between(startDate, endDate);

        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println("남은 기간: " + period.getYears() + "년 " + period.getMonths() + "월 " + period.getDays() + "일 ");
        System.out.println("디데이: " + ChronoUnit.DAYS.between(startDate, endDate) + "일 남음");
    }
}