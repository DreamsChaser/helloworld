package 三轮.E_Thread.createThread;

/**
 * @author sirius
 * @since 2019/3/27
 */
public class ThreadTest {

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        ThreadDemo threadDemo2 = new ThreadDemo();
        threadDemo.start();
        threadDemo2.start();

    }
}
