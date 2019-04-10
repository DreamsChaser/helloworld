package 三轮.E_Thread.conditionDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sirius
 * @since 2019/4/10
 */
public class ProducerAndConsumer {

    private static ReentrantLock lock = new ReentrantLock();

    private static int balance = 100;

    private static int num = 0;

    private static int earn = 0;

    public static void main(String[] args) {
        Condition coco = lock.newCondition();
        ExecutorService producer = Executors.newCachedThreadPool();
        while (true) {
            if (balance <= 0){
                break;
            }
            producer.submit(new Runnable() {
                @Override
                public void run() {
                    lock.lock();
                    try {
                        if (num == 0) {
                            TimeUnit.SECONDS.sleep(2);
                            num = num + 1;
                            System.out.println("可乐到了");
                            coco.signal();
                            System.out.println("通知结束");
                        } else {
                            coco.await();
                            System.out.println("coco被买走了");
                            earn = earn + 10;
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            });

        }
        ExecutorService consumer = Executors.newCachedThreadPool();
        while (true) {
            if (balance <= 0) {
                break;
            }
            consumer.submit(new Runnable() {
                @Override
                public void run() {
                    lock.lock();
                    try {
                        if (num == 0) {
                            System.out.println("coco没货了");
                            coco.signal();
                        } else {
                            balance = balance - 5;
                            System.out.println("买到了");
                            coco.await();
                        }
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            });
        }
    }
}
