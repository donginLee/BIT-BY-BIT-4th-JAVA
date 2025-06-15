/* 
AuthGradeMain1 이라는 클래스를 만들고 다음 결과가 출력되도록 코드를 작성해라.
앞서 만든 AuthGrade 을 활용하자
*/

package enumeration.test.ex1;

public class AuthGradeMain1 {

    public static void main(Stringp[] args) {
        for (AuthGrade authGrade: AuthGrade.values()) {
            System.out.println("grade=" + authGrade.name() + ", level=" + authGrade.getLevel() + ", 설명=" + authGrade.getDescription());
        }
    }
}