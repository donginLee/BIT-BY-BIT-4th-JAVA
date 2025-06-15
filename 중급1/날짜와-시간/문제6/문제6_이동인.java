import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();
        
        printCalendar(year, month); // 모듈화
    }
    
    public static void printCalendar(int year, int month){
        LocalDate firstDay = LocalDate.of(year,month,1);
        LocalDate firstDayOfNextMonth = firstDay.plusMonths(1);
        
        int firstDayOfWeek = firstDay.getDayOfWeek().getValue() % 7;
        System.out.println("Su Mo Tu We Th Fr Sa");
    
        for (int i=0;i<firstDayOfWeek;i++){
            System.out.print("   ");
        }
        LocalDate iter = firstDay;
        while (iter.isBefore(firstDayOfNextMonth)){
            System.out.printf("%3d", iter.getDayOfMonth());
            if(iter.getDayOfWeek() == DayOfWeek.SATURDAY){ // 열거형
                System.out.println();
            }
            iter = iter.plusDays(1);
        }
    }
}