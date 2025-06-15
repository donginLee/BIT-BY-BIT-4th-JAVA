/* 
서울의 회의 시간은 2024년 1월 1일 오전 9시다. 이때 런던, 뉴욕의 회의 시간을 구해라.
실행 결과를 참고하자.
TestZone 클래스에 문제를 풀어라.
*/

package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.of(2024, 1, 1, 9, 0, 0), ZoneId.of("Asia/Seoul"));
        
        System.out.println("서울의 회의 시간: " + zdt);
        System.out.println("런던의 회의 시간: " + zdt.withZoneSameInstant(ZoneId.of("Europe/London")));
        System.out.println("뉴욕의 회의 시간: " + zdt.withZoneSameInstant(ZoneId.of("America/New_York")));
    }
}