package cn.com.git.leon.thread.yieldAndJoin;

/**
 * @author sirius
 */
public class YieldTest implements Runnable{

    public void run() {
        for (int i = 0;i<5;i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(i+":我是线程"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        YieldTest yieldTest = new YieldTest();
        Thread thread1 = new Thread(yieldTest,"A");
        Thread thread2 = new Thread(yieldTest,"B");
        thread1.start();
        thread2.start();
    }
}
