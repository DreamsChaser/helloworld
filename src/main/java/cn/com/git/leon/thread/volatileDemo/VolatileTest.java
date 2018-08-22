package cn.com.git.leon.thread.volatileDemo;

/**
 * Created by shinco on 2018/8/22.
 */
public class VolatileTest implements Runnable{

    int i = 0;

    public void run() {
        i++;
        System.out.println(i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        VolatileTest volatileTest = new VolatileTest();
        Thread thread1 = new Thread(volatileTest);
        Thread thread2 = new Thread(volatileTest);
        thread1.start();
        thread2.start();
    }
}
