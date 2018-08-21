package cn.com.git.leon.thread.store;

/**
 * @author sirius
 */
public class Customer implements Runnable{

    private Good good;

    private double money;

    public void run() {
        while (true) {
            if (money > 0) {
                synchronized (good) {
                    if (good.getNum() <= 0) {
                        System.out.println("没有鸡蛋饼了");
                        try {
                            good.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        good.setNum(good.getNum()-1);
                        money = money - good.getPrice();
                        System.out.println("鸡蛋饼吃完了");
                        good.notifyAll();
                    }
                }
            }else {
                System.out.println("还剩"+money+"元,回家了");
                break;
            }
        }
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
