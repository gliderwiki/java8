package thread;

/**
 * @Author : yion
 * @Date : 2017. 5. 21.
 * @Description :
 */
public class Threads {
    public static void main(String[] args) throws InterruptedException {
        // 새로운 스레드를 생성 할 때는 새로운 Thread 객체를 생성해야 한다.
        final Thread separateThread = new Thread(new ThreadPrinter());
        separateThread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("From the main Thread : " + Thread.currentThread().getName());

            Thread.sleep(1000);
        }
    }


    private static class ThreadPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("From the new thread : " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
