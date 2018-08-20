package cn.com.git.leon.thread.ticket;

/**
 * @author sirius多线程买票问题
 */
public class Ticket implements Runnable{

    private static int num = 1;

    public void run() {
        while (true) {
            String name = Thread.currentThread().getName();
            synchronized (this) {
                if (num <= 0) {
                    System.out.println(name + "票已售完");
                    break;
                } else {
                    num--;
                    System.out.println(name + "卖了1张票，还剩" + num + "张");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
