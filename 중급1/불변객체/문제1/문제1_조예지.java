/* 
MyDate 클래스는 불변이 아니어서 공유 참조시 사이드 이펙트가 발생한다. 이를 불변 클래스로 만들어라.
새로운 불변 클래스는 ImmutableMyDate 로 이름 지으면 된다.
새로운 실행 클래스는 ImmutableMyDateMain 으로 이름 지으면 된다.

// MyDateMain.java
package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2024,1,1);
        MyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("2025 -> date1");
        date1.setYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}

// MyDate.java
package lang.immutable.test;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
*/

// ImmutableMyDateMain.java
package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        date1 = date1.withYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}

// ImmutableMyDate.java
package lang.immutable.test;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    // with 메서드: 일반적으로 원본 객체는 그대로 유지하고 변경사항을 포함하는 객체의 새 인스턴스를 반환하는 메서드를 의미함
    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, month, day);
    }
    
    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(year, newMonth, day);
    }
    
    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(year, month, newDay);
    }
    
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
