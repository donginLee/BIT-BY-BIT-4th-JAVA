import java.util.Random;
public class Main {
    public static void main(String[] args){
        Integer[] lottoNumbers = LottoGenerator.LottoGenerate();
        System.out.print("로또번호 : ");
        for (Integer num: lottoNumbers){
            System.out.print(num+" ");
        }
    }
    public class LottoGenerator{
        private static final Random random = new Random();
        public static Integer[] LottoGenerate(){
            Integer [] lottoNumbers = new Integer[6];
            for (int i=0;i<6;i++){
                lottoNumbers[i] = random.nextInt(45) + 1;
                while (!isUnique(i,lottoNumbers)){
                    lottoNumbers[i] = random.nextInt(45) + 1;
                }
            }
            return lottoNumbers;
        }
        public static boolean isUnique(int idx, Integer[] array){
            for (int i=0;i<idx;i++){
                if(array[i]==array[idx]){
                    return false;
                }
            }
            return true;
        }
    }
}