package cn.com.git.leon.thread.store;


/**
 * Created by wangDi on 2018/8/21.
 */
public class Test {

    public static void main(String[] args) {
        Good good = new Good();
        good.setNum(0);
        good.setPrice(20);
        Businessman businessman = new Businessman();
        businessman.setGood(good);
        Customer customer = new Customer();
        customer.setGood(good);
        customer.setMoney(100);
        Thread thread1 = new Thread(businessman);
        Thread thread2 = new Thread(customer);
        thread2.setPriority(10);
        thread2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
    }
}
