package cn.com.git.leon.thread.demo.printABC.d1;

/**
 * @author sirius
 * @since 2018/9/9
 */
public class Print {

    public static StringBuffer str = new StringBuffer("A");

    public static Object lock = new Object();

    public static int i = 0;

    public static void main(String[] args) {


        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    while (i < 100) {
                        if (str.toString().equals("A")) {
                            i++;
                            System.out.println("线程A" + "--" + str + "--" + i);
                            str.append("B");
                            str.delete(0,1);
                            lock.notifyAll();
                        } else {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    while (i < 100) {
                        if (str.toString().equals("B")) {
                            i++;
                            System.out.println("线程B" + "--" + str + "--" + i);
                            str.append("C");
                            str.delete(0,1);
                            lock.notifyAll();
                        }else {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });
        Thread threadC = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    while (i < 100) {
                        if (str.toString().equals("C")) {
                            i++;
                            System.out.println("线程C" + str + "--" + i);
                            str.append("A");
                            str.delete(0,1);
                            lock.notifyAll();
                        }else {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        });
        threadA.start();
        threadB.start();
        threadC.start();
        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
