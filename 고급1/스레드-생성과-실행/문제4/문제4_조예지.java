/* 
Thread-A , Thread-B 두 스레드를 만들어라
Thread-A 는 1초에 한 번씩 "A"를 출력한다.
Thread-B 는 0.5초에 한 번씩 "B"를 출력한다.
이 프로그램은 강제 종료할 때 까지 계속 실행된다.
*/

package thread.start.test;

import static util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        MyRunnable runnableA = new MyRunnable(1000, "A");
        MyRunnable runnableB = new MyRunnable(500, "B");

        Thread threadA = new Thread(runnableA, "Thread-A");
        Thread threadB = new Thread(runnableB, "Thread-B");

        threadA.start();
        threadB.start();
    }

    static class MyRunnable implements Runnable {
        int millis;
        String value;

        MyRunnable(int millis, String value) {
            this.millis = millis;
            this.value = value;
        }

        @Override
        public void run() {
            while (true) {
                log(value);
    
                try {
                    Thread.sleep(millis);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}