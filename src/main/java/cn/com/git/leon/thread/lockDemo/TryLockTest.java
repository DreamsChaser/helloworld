package cn.com.git.leon.thread.lockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 */
public class TryLockTest implements Runnable{
    private Lock lock = new ReentrantLock();

    public void run() {
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + ":" + "获得锁");
            try {
                for (int i = 0; i < 2; i++) {
                    System.out.println(i);
                }
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("error");
            } finally {
                System.out.println("释放了锁");
                lock.unlock();
            }
        }else {
            System.out.println(Thread.currentThread().getName()+"没有获得锁");
        }
    }

    public static void main(String[] args) {
        TryLockTest lockTest = new TryLockTest();
        new Thread(lockTest,"线程1").start();
        new Thread(lockTest,"线程2").start();
    }
}
