package 三轮.E_Thread.lock;

import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2019/4/3
 */
public class ReadAndWriteTest {
    public static void main(String[] args) {
        ReadAndWriteLockDemo readAndWriteLockDemo = new ReadAndWriteLockDemo();
        new Thread(readAndWriteLockDemo,"诵明月之诗").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(readAndWriteLockDemo,"歌窈窕之章").start();

    }
}
