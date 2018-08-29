package cn.com.git.leon.thread.lockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 */
public class LockTest implements Runnable{

    private Lock lock = new ReentrantLock();

    public void run() {
        lock.lock();

        System.out.println(Thread.currentThread().getName()+":"+"获得锁");
        try {
            Thread.sleep(10000);
            for (int i = 0; i < 2; i++) {
                System.out.println(i);
            }
        }catch (Exception e){
            System.out.println("error");
        }finally {
            System.out.println("释放了锁");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
        new Thread(lockTest,"线程1").start();
        new Thread(lockTest,"线程2").start();
    }
}
