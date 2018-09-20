package cn.com.git.leon.thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2018/9/20
 */
public class ScheduleThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1");
            }
        };
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程2");
            }
        };
        executorService.execute(runnable);
        executorService.execute(runnable1);
        executorService.schedule(runnable,3L, TimeUnit.SECONDS);
        executorService.schedule(runnable1,6L, TimeUnit.SECONDS);
        executorService.shutdown();
    }
}
