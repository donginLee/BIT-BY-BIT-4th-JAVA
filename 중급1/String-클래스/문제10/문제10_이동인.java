public class Main {
    public static void main(String[] args){
        String original = "배태용,조예지,김민협,박수영,이동인";
        String [] people = original.split(",");
        System.out.println(String.join("!! ", people));
        // join은 static 메서드 : 연결자, 배열
    }
}