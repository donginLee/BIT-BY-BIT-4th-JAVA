/* 
다음 코드를 작성하고, 코드를 실행하기 전에 로그가 어떻게 출력될지 예측해보자. 
그리고 총 실행 시간이 얼마가 걸릴지 예측해 보자.

package thread.control.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinTest1Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyTask(), "t1");
        Thread t2 = new Thread(new MyTask(), "t2");
        Thread t3 = new Thread(new MyTask(), "t3");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

        System.out.println("모든 스레드 실행 완료");
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                log(i);
                sleep(1000);
            }
        }
    }
}
*/

/*
 * 예상 결과
 * 
 * 하나의 스레드가 끝난 다음에 다음 스레드를 실행하도록 join()을 호출하고 있다.
 * 
 * 따라서 t1, t2, t3의 로그가 순서대로 출력되고
 * 마지막으로 "모든 스레드 실행 완료"가 출력될 것이다.
 * 
 * 총 실행 시간은 9초가 걸릴 것이다.
 */