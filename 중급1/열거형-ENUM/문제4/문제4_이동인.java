import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("HTTP CODE : ");
        int httpCodeInput = scanner.nextInt();
        HttpStatus status = HttpStatus.findByCode(httpCodeInput);
        if (status == null) {
            System.out.println("정의되지 않은 코드"); }
        else {
          System.out.println(status.getCode() + " " + status.getMessage());
          System.out.println("isSuccess = " + status.isSuccess());
        }
    }
    
    
    public enum HttpStatus {
        OK(200,"OK"), BAD_REQUEST(400, "Bad Request"), NOT_FOUND(404, "Not Found"), INTERNAL_SERVER_ERROR(500,"Internal Server Error");
        private final int code;
        private final String message;
        HttpStatus(int code, String message){
            this.code = code;
            this.message = message;
        }
        public static HttpStatus findByCode(int num){
            for (HttpStatus status : HttpStatus.values()) {
                if (status.getCode() == num) {
                return status;}
            }
            return null;
        }
        public int getCode(){
            return code;
        }
        public String getMessage(){
            return message;
        }
        public boolean isSuccess(){
            return 200<=this.code && this.code<300;
        }
    }
}