package cn.com.git.leon.thread.atomicDemo;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author sirius
 * @since 2018/9/10
 */
public class AtomicIntegerDemo {

    public static CountDownLatch countDownLatch;

    static AtomicInteger count = new AtomicInteger(0);

    public static void execute() {
        countDownLatch = new CountDownLatch(1000);
        ExecutorService executor = Executors.newFixedThreadPool(1000);
        for (int i = 0;i<1000;i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    count.getAndIncrement();
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
        System.out.println(count.get());
        count.compareAndSet(1000,0);
    }

    public static void main(String[] args) {
        for (int i = 0;i<10;i++){
            execute();
        }
    }
}
