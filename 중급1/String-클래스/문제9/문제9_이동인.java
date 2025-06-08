public class Main {
    public static void main(String[] args){
        String original = "배태용,조예지,김민협,박수영,이동인";
        String [] people = original.split(",");
        for (String person : people){
            System.out.println(person);
        }
    }
}