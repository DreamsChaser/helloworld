package cn.com.git.leon.thread.yieldAndJoin;

/**
 * @author sirius
 */
public class JoinTest implements Runnable{

    public void run() {
        for (int i = 0;i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+":我是线程"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        JoinTest joinTest = new JoinTest();
        Thread thread1 = new Thread(joinTest,"A");
        Thread thread2 = new Thread(joinTest,"B");
        thread1.start();
        try {
            //调用thread1.join(),主线程阻塞 不会执行thread2.start(),thread1完成后唤醒主线程继续执行
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}
