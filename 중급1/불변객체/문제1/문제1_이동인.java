public class ImmutableMyDate{
    private final int year;
    private final int month;
    private final int day;
    // 불변객체를 만들기 위해서는 멤버 변수에 final 키워드를 붙인다.
    
    public ImmutableMyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public ImmutableMyDate withYear(int year){
        return new ImmutableMyDate(year, this.month, this.day);
    }
    
    public ImmutableMyDate withMonth(int month){
        return new ImmutableMyDate(this.year, month, this.day);
    }
    
    public ImmutableMyDate withDay(int day){
        return new ImmutableMyDate(this.year, this.month, day);
    }
    @Override 
    public String toString() {
        return this.year + "-" + this.month + "-" + this.day;
    }
}