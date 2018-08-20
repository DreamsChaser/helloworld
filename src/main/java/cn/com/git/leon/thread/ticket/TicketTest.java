package cn.com.git.leon.thread.ticket;

/**
 * Created by wangDi on 2018/8/18.
 */
public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket,"窗口1");
        Thread thread2 = new Thread(ticket,"窗口2");
        Thread thread3 = new Thread(ticket,"窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
