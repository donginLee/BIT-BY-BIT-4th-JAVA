import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AuthGrade[] arr = AuthGrade.values();
        System.out.print("당신의 등급을 입력하세요" + Arrays.toString(arr) + ": ");
        String input = sc.nextLine();

        int index = 0;

        for (AuthGrade val : arr) {
            if (input.equals(val.name())) {
                System.out.println("당신의 등급은 " + val.getDescription() + "입니다.");
                break;
            } else {
                index++;
            }
        }
        System.out.println("==메뉴 목록==");
        System.out.println("- 메인 화면");
        if (!arr[index].name().equals("GUEST")) {
            System.out.println("- 이메일 관리 화면");
            if (!arr[index].name().equals("LOGIN")) {
                System.out.println("- 관리자 화면");
            }
        }
    }
}