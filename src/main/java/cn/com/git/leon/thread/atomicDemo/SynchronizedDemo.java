package cn.com.git.leon.thread.atomicDemo;

import java.util.concurrent.CountDownLatch;

/**
 * @author sirius
 * @since 2018/9/10
 */
public class SynchronizedDemo {

    public static CountDownLatch countDownLatch;

    public static Object lock = new Object();

    static int count;

    public static void execute() {
        count = 0;
        countDownLatch = new CountDownLatch(1000);
        for (int i = 0;i<1000;i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (lock) {
                        count++;
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        try {
            countDownLatch.await();
            System.out.println(count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for (int i = 0;i<50;i++){
            execute();
        }
    }
}
