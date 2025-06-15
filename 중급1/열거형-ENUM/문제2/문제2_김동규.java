public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] auths = AuthGrade.values();
        for (AuthGrade val : auths) {
            System.out.printf("grade=%s, level=%d, 설명=%s\n", val.name(), val.getLevel(), val.getDescription());
        }
    }
}