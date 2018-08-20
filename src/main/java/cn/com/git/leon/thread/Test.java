package cn.com.git.leon.thread;

/**
 * Created by shinco on 2018/8/13.
 */
public class Test {
    public static void main(String[] args) {
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
