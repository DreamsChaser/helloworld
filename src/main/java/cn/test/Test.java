package cn.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author sirius
 */
public class Test {

    public static void main(String[] args) {
        Integer i = -129;
        Integer j = -129;
        System.out.println(i==j);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
