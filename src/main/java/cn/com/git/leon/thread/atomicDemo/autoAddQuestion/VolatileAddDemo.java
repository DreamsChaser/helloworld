package cn.com.git.leon.thread.atomicDemo.autoAddQuestion;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author sirius
 * @since 2018/9/10
 */
public class VolatileAddDemo {

    public static CountDownLatch countDownLatch;

    static volatile int count;

    public static void execute() {
        count = 0;
        countDownLatch = new CountDownLatch(1000);
        ExecutorService executor = Executors.newFixedThreadPool(1000);
        for (int i = 0;i<1000;i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    count++;
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();
        System.out.println(count);
    }

    public static void main(String[] args) {
        for (int i = 0;i<100;i++){
            execute();
        }
    }
}
