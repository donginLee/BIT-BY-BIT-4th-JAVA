/*
Class 클래스
리플렉션 : 런타임 중 동적으로 클래스의 모든 정보 조회 가능
스프링 프레임워크가 DI, AOP, 빈 주입에 사용하는 리플렉션 사례
실무 어떻게 활용할 수 있을까

*/

public class 문제1_박수영 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int tot = Integer.parseInt(str1) + Integer.parseInt(str2);

        System.out.println("tot = " + tot);
    }
}
