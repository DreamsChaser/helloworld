package cn.com.git.leon.thread;

/**
 * Created by shinco on 2018/8/20.
 */
public class TDemo implements Runnable{

    private Object vitual = new Object();

    public void run() {
//        for (int i = 0;i<3;i++) {
            synchronized (vitual) {
                Thread thread = Thread.currentThread();
                try {
                    Thread.sleep(1000 * 5);
                    System.out.println(thread.getName() + "获得了锁"+ System.currentTimeMillis());
                    if (thread.getName().equals("线程1")) {
                        vitual.wait();
                        System.out.println("wait");
                    }else {
                        vitual.notifyAll();
                        System.out.println("notifyAll");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//        }
    }

    public static void main(String[] args) {
        TDemo tDemo = new TDemo();
        Thread thread1 = new Thread(tDemo,"线程1");
        thread1.setPriority(10);
        Thread thread2 = new Thread(tDemo,"线程2");
        thread1.start();
        thread2.start();


    }
}
