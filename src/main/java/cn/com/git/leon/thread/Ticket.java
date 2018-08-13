package cn.com.git.leon.thread;

/**
 * Created by shinco on 2018/8/13.
 */
public class Ticket implements Runnable {

    /**
     * 剩余票数(一共10张)
     */
    public static int restTicket = 10;

    public void run() {
        try {
            while (true) {
                if (restTicket <= 0) {
                    System.out.println("票已售完");
                    break;
                }
                String threadName = Thread.currentThread().getName();
                synchronized (this) {
                    restTicket--;
                    System.out.println(threadName + "卖出1张票，剩余" + restTicket);
                }
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
