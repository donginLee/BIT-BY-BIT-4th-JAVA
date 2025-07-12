/* 
지역 클래스를 완성해라
*/


// OuterClass3.java
package nested.test;

public class OuterClass3 {
    public void myMethod() {
        // 여기에 지역 클래스 LocalClass를 구현하고 hello() 메서드를 호출해라.

        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        LocalClass local = new LocalClass();
        local.hello();
    }
}

// OuterClass3Main.java
package netsed.test;

public class OuterClass3Main {
    public static void main(String[] args) {
        OuterClass3 outer = new OuterClass3();
        outer.myMethod();
    }
}