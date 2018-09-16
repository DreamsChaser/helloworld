package cn.com.git.leon.thread;

import java.util.concurrent.Callable;

/**
 * @author sirius
 * @since 2018/9/16
 */
public class CallableDemo implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        int i = 0;
        return ++i;
    }
}
