package cn.com.git.leon.thread.store;

/**
 * @author sirius
 */
public class Businessman implements Runnable{

    private double money;

    private Good good;

    public void run() {
        while (true){
            if (money >= 100){
                System.out.println("赚了100元，回家了！");
                break;
            }else {
                if (good.getNum()>0){
                    System.out.println("新鲜的鸡蛋饼出炉啦，快来买！");
                    try {
                        good.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    good.setNum(good.getNum()+1);
                    System.out.println("稍等片刻，正在制作鸡蛋饼");
                }
            }
        }
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }
}
