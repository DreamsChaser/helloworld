package cn.com.git.leon.thread.cyclicBarrier;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author sirius
 * @since 2018/9/10
 */
public class CyclicBarrierDemo{

    public static int count;

    public static CyclicBarrier cyclicBarrier = new CyclicBarrier(1000, new Runnable() {
        @Override
        public void run() {
            System.out.println("执行完了");
            cyclicBarrier.reset();
        }
    });

    public void add(){
            for (int i = 0; i < 1000; i++) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        count++;
                        try {
                            cyclicBarrier.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (BrokenBarrierException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
    }

    public static void main(String[] args) {
        CyclicBarrierDemo cyclicBarrierDemo = new CyclicBarrierDemo();
            cyclicBarrierDemo.add();
    }
}
