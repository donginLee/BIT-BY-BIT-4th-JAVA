import java.util.Random;
public class Main {
    public static void main(String[] args){
        AuthGrade [] values = AuthGrade.values();
        for (AuthGrade value : values){
            System.out.println("grade : "+value.name()+", level : "+value.getLevel()+", description : "+value.getDescription());
        }
    }
    
    public enum AuthGrade {
        GUEST(1,"손님"),LOGIN(2,"로그인 회원"), ADMIN(3,"관리자");
        private final int level;
        private final String description;
        
        AuthGrade(int level, String description){
            this.level = level;
            this.description = description;
        }
        
        public int getLevel(){
            return this.level;
        }
        
        public String getDescription(){
            return this.description;
        }
    }
}