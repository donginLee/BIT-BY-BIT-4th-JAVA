import java.util.Random;

public class LottoGenerator {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            boolean flag = false;
            int num = -1;
            while(!flag) {
                flag = true;
                num = rand.nextInt(1,46);
                for(int j = 0; j < i; j++) {
                    if(num == lotto[j]) {
                        flag = false;
                        break;
                    }
                }
            }
            lotto[i] = num;
        }
        System.out.print("로또 번호: ");
         for(int i = 0; i < 6; i++) {
             System.out.print(lotto[i] + " ");
         }
    }
}