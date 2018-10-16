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
        Object[] origin = {123,"str"};

        Object[] array = Arrays.copyOf(origin,4);
        System.out.println(array);
        System.out.println(array.length);
    }

}
