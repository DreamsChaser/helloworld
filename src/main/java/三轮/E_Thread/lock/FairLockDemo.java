package 三轮.E_Thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 * @since 2019/4/1
 */
public class FairLockDemo {

    private Lock lock = new ReentrantLock(true);

}
