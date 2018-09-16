package cn.com.git.leon.thread;

import java.util.Date;

/**
 * Created by shinco on 2018/8/13.
 */
public class CustomThread implements Runnable{

    public void run() {
        System.out.println(new Date());
        synchronized (this) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName());
//            try {
//                Thread.sleep(200000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(new Date());
        }
    }
}
