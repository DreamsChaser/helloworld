package cn.com.git.leon.thread.lockDemo.reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 * @since 2018/10/24
 */
public class ReentrantLockDemo {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();
    }
}
