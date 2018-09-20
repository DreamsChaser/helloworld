package cn.com.git.leon.thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2018/9/20
 */
public class SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0;i<50;i++) {
            executorService.execute(() -> {
                String name = Thread.currentThread().getName();
                System.out.println("我是" + name);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

    }
}
