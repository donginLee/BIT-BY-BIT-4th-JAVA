/* 
로또 번호를 자동으로 만들어주는 자동 생성기를 만들자
로또 번호는 1~45 사이의 숫자를 6개 뽑아야 한다.
각 숫자는 중복되면 안된다.
실행할 때 마다 결과가 달라야 한다.
*/

package lang.math.test;

import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int[] selected = new int[6];
        int size = 0;

        Random random = new Random();

        while (size < 6) {
            int num = random.nextInt(45) + 1;

            if (checkDup(num)) continue;

            selected[size] = num;
            size++;
        }
        
        System.out.print("로또 번호: ");
        for (int i: selected) {
            System.out.print(i + " ");
        }
    }

    public boolean checkDup(int num, int size, int[] selected) {
        for (int i = 0; i < size; i++) {
            if (selected[i] == num) return true;
        }
        return false;
    }
}