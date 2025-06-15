/* 
실행 결과를 참고해서 달력을 출력해라.
입력 조건: 년도, 월
실행시 날짜의 간격에는 신경을 쓰지 않아도 된다. 간격을 맞추는 부분은 정답을 참고하자.
*/

package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.println("월을 입력하세요: ");
        int month = scanner.nextInt();

        System.out.println("Su Mo Tu We Th Fr Sa");

        LocalDate ld = LocalDate.of(year, month, 1);
        for (int i = 0; i < ld.getDayOfWeek().getValue() % 7; i++) System.out.print("   ");
        
        while (ld.getMonthValue() == month) {
            System.out.printf("%2d ", ld.getDayOfMonth());
            
            if (ld.getDayOfWeek() == DayOfWeek.SATURDAY) System.out.println();

            ld = ld.plusDays(1);
        }
    }
}