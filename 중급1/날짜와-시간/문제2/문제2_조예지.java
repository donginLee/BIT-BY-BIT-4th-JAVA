/* 
2024년 1월 1일 부터 2주 간격으로 5번 반복하여 날짜를 출력하는 코드를 작성하세요.
TestLoopPlus 클래스에 문제를 풀어라
*/

package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2024, 1, 1);
        
        for (int i = 0; i < 5; i++) {
            LocalDate nxtLd = ld.plusWeeks(i * 2);
            System.out.println("날짜 " + (i + 1) + ": " + nxtLd);
        }
    }
}