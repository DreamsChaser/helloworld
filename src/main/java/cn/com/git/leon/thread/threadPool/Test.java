package cn.com.git.leon.thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by shinco on 2018/8/13.
 */
public class Test {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("1"+ "abc");
            }
        });
        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("2"+"abc");
            }
        });
        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("3" + "abc");
            }
        });
    }
}
