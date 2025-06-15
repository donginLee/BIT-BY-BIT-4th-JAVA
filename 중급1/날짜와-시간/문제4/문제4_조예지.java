/* 
입력 받은 월의 첫날 요일과 마지막날 요일을 구해라.
*/

package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate ld = LocalDate.of(year, month, 1);
        
        System.out.println("firstDayOfWeek = " + ld.getDayOfWeek());
        System.out.println("lasDayOfWeek = " + ld.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());
    }
}