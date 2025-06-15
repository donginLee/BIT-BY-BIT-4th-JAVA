import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
public class Main {
	public static void main(String[] args) {
		int year = 2024;
		int month = 1;
		LocalDate date = LocalDate.of(year, month, 1); // 2024년 1월 1일
		DayOfWeek firstDayOfWeek = date.getDayOfWeek(); // 요일 구하기
		DayOfWeek lastDayOfWeek =
		    date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek(); // 매개변수로 함수 넘김 
		System.out.println("firstDayOfWeek = " + firstDayOfWeek);
		System.out.println("lastDayOfWeek = " + lastDayOfWeek);
	}
}
```