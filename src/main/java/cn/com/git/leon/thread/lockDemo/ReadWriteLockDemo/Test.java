package cn.com.git.leon.thread.lockDemo.ReadWriteLockDemo;

import java.util.Random;

/**
 * @author sirius
 * @since 2018/10/23
 */
public class Test {

    public static void main(String[] args) {
        Data data = new Data();
        for (int i = 0;i<3;i++){
            new Thread(()->data.setData(new Random().nextInt(30))).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0;i<3;i++){
            new Thread(()->data.getData()).start();
        }
    }
}
