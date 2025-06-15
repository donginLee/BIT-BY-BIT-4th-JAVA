import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요 [GUEST, LOGIN, ADMIN]: " );
        String grade = scanner.nextLine();
        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase()); // 인스턴스에 접근시 valueOf 사용
        System.out.println("당신의 등급은 "+authGrade.getDescription()+"입니다.");
        System.out.println("==메뉴 목록==");
        System.out.println("- 메인 화면");
        if (authGrade.getLevel()>1)
            System.out.println("- 이메일 관리화면");
        if (authGrade.getLevel()>2)
            System.out.println("- 관리자 화면");
    }
    
    public enum AuthGrade {
        GUEST(1,"손님"),LOGIN(2,"로그인 회원"), ADMIN(3,"관리자");
        private final int level;
        private final String description;
        AuthGrade(int level, String description){
            this.level = level;
            this.description = description;
        }
        
        public int getLevel(){
            return this.level;
        }
        
        public String getDescription(){
            return this.description;
        }
    }
}