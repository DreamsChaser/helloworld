package 三轮.E_Thread.lock;

/**
 * @author sirius
 * @since 2019/4/3
 */
public class WriteLockTest {
    public static void main(String[] args) {
        WriteLockDemo writeLockDemo = new WriteLockDemo();
        new Thread(writeLockDemo,"诵明月之诗").start();
//        new Thread(writeLockDemo,"歌窈窕之章").start();
    }
}
