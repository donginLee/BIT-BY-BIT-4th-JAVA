/* 
정적 중첩 클래스를 완성해라
*/


// OuterClass1.java
package nested.test;

public class OuterClass1 {
    // 여기에 NestedClass를 구현해라. 그리고 hello() 메서드를 만들어라.
    static class NestedClass {
        public void hello() {
            System.out.println("NestedClass.hello");
        }
    }
}

// OuterClass1Main.java
package nested.test;

public class OuterClass1Main {
    public static void main(String[] args) {
        // 여기에서 NestedClass의 hello() 메서드를 호출하라.
        OuterClass1.NestedClass nested = new OuterClass1.NestedClass();
        nested.hello();
    }
}