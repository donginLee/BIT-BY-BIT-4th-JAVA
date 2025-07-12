/* 
익명 클래스를 완성해라
*/

// Hello.java
package nested.test;

public interface Hello {
    void hello();
}

// AnonymousMain.java
package nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
        // 여기에서 Hello의 익명 클래스를 생성하고 hello()를 호출해라.

        Hello h = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };

        h.hello();
    }
}