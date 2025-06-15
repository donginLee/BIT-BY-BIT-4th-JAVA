public void myMethod() {
    class LocalClass {
        public void hello() {
            System.out.println("LocalClass.hello");
        }
    }
    LocalClass local = new LocalClass();
    local.hello();
}