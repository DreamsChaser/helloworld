package 三轮.E_Thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 * @since 2019/4/1
 */
public class InterreptLockDemo implements Runnable{

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            lock.lockInterruptibly();
            System.out.println(Thread.currentThread().getName()+"获得了锁");
            Thread.sleep(1000*10);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName()+"释放了锁");
        }
    }
}
