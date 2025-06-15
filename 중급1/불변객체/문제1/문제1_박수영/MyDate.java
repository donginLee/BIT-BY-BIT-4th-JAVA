/*

모든 클래스의 최상위 부모 클래스

자바에서 명시적으로 상속하지 않으면 자동으로 extends Object 됨

java.lang 패키지에 포함되어 import 없이 사용 가능

OCP(Open-Closed Principle)
*/

public class MyDate {
    private final int year;
    private final int month;
    private final int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate changeYear(int newYear) {
        return new MyDate(newYear, month, day);
    }

    public MyDate changeMonth(int newMonth) {
        return new MyDate(year, newMonth, day);
    }

    public MyDate changeDay(int newDay) {
        return new MyDate(year, month, newDay);
    }
}
