package cn.com.git.leon.thread;

import java.util.Date;

/**
 * Created by shinco on 2018/8/13.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        Thread t=Thread.currentThread();
        System.out.println("ThreadID:"+t.getId()+", ThreadName:"+t.getName());
        super.run();
        if (t.getId() == 11) {
            synchronized (this) {
                startWait();
            }
        }else {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            closeWait();
        }
    }

    public synchronized void startWait() {
        Thread t=Thread.currentThread();
        System.out.println("ThreadID:"+t.getId()+", ThreadName:"+t.getName());
        System.out.println("开始等待" + new Date());
        try {
            this.wait(1000 * 20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束等待" + new Date());
    }

    public synchronized void closeWait() {
        Thread t=Thread.currentThread();
        System.out.println("ThreadID:"+t.getId()+", ThreadName:"+t.getName());
        this.notifyAll();
        System.out.println("结束等待" + new Date());
    }
}