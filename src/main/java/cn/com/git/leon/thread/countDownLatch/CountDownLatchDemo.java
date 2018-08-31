package cn.com.git.leon.thread.countDownLatch;

import javax.sound.midi.Soundbank;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 四个线程统计大小，主线程汇总
 * @author sirius
 * @since 2018/8/31
 */
public class CountDownLatchDemo {

    private static CountDownLatch countDownLatch = new CountDownLatch(4);

    private static ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {
        for (int i = 0;i<4;i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000 * 2);
                        System.out.println("统计每个盘的大小");
                        countDownLatch.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        try {
            countDownLatch.await();
            executorService.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
