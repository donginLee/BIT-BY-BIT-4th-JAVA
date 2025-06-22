import java.util.Scanner;

public class 문제3_박수영 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String grade = scanner.nextLine();
        Grade Grade = Grade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + Grade.getDescription() + "입니
                다.");
                System.out.println("==메뉴 목록==");
        if (Grade.getLevel() > 0) {
            System.out.println("- 메인 화면");
        }
        if (Grade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }
        if (Grade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }
    }
}