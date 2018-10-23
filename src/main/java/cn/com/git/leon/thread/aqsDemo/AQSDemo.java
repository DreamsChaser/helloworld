package cn.com.git.leon.thread.aqsDemo;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author sirius
 * @since 2018/10/23
 */
public class AQSDemo {
    public static void main(String[] args) {
        AbstractQueuedSynchronizer queue = new AbstractQueuedSynchronizer() {
            @Override
            protected boolean tryAcquire(int arg) {
                return super.tryAcquire(arg);
            }

            @Override
            protected boolean tryRelease(int arg) {
                return super.tryRelease(arg);
            }

            @Override
            protected int tryAcquireShared(int arg) {
                return super.tryAcquireShared(arg);
            }

            @Override
            protected boolean tryReleaseShared(int arg) {
                return super.tryReleaseShared(arg);
            }

            @Override
            protected boolean isHeldExclusively() {
                return super.isHeldExclusively();
            }
        };
    }
}
