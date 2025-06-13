public class Main {
    public static void main(String[] args){
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        
        int count = 0;
        int idx = str.indexOf(key);
        while (idx!=-1){
            idx = str.indexOf(key, idx+1); // idx+1부터 탐색, 없으면 -1 반환
            count += 1;
        }
        System.out.println("count = "+ count);
        
    }
}