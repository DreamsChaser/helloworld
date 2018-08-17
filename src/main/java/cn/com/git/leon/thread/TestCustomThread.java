package cn.com.git.leon.thread;

/**
 * Created by shinco on 2018/8/17.
 */
public class TestCustomThread {

    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();
        //新建状态 new
        Thread thread = new Thread(customThread,"线程1");
        //就绪状态 ready
        thread.start();
    }
}
