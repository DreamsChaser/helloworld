package cn.com.git.leon.thread.lockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 */
public class InterreptLockTest implements Runnable{

    private Lock lock = new ReentrantLock();

    public void run() {
        try {
            write();
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"中断了");
        }
    }

    public void write() throws InterruptedException {
        lock.lockInterruptibly();
        try {
            System.out.println(Thread.currentThread().getName()+"获得了锁");
            Thread.sleep(1000*5);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println(Thread.currentThread().getName()+"释放了锁");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        InterreptLockTest test = new InterreptLockTest();
        Thread thread1 = new Thread(test,"线程1");
        Thread thread2 = new Thread(test,"线程2");
        thread1.start();
        thread2.start();
        thread2.interrupt();

    }
}
