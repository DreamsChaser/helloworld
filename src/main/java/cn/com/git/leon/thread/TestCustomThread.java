package cn.com.git.leon.thread;

import java.util.concurrent.CountDownLatch;

/**
 * Created by shinco on 2018/8/17.
 */
public class TestCustomThread {

    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        //新建状态 new
        Thread thread = new Thread(customThread,"线程1");
        //就绪状态 ready
//        thread.start();
        System.out.println(Thread.currentThread().getId());
        try {
            new CountDownLatch(1).await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //
    }
}
