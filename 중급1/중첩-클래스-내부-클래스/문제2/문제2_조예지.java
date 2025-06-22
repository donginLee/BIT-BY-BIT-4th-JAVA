/* 
내부 클래스를 완성해라
*/


// OuterClass2.java
package nested.test;

public class OuterClass2 {
    // 여기에 InnerClass를 구현해라. 그리고 hello() 메서드를 만들어라.
    class InnerClass {
        public void hello() {
            System.out.println("InnerClass.hello");
        }
    }
}

// OuterClass2Main.java
package netsed.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        // 여기에서 InnerClass의 hello() 메서드를 호출하라.
        OuterClass2.InnerClass inner = new OuterClass2().new InnerClass();
        inner.hello();
    }
}