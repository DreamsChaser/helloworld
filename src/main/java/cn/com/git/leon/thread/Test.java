package cn.com.git.leon.thread;

/**
 * Created by shinco on 2018/8/13.
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 买票问题
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket,"窗口1");
        Thread thread2 = new Thread(ticket,"窗口2");
        Thread thread3 = new Thread(ticket,"窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
         */
        /**
         * 线程状态
         */
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            MyThread myThread1 = new MyThread();
            myThread1.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
