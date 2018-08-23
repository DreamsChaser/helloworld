package cn.com.git.leon.thread.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by wangDi on 2018/8/22.
 */
public class TimerTest extends TimerTask{

    public void run() {
        System.out.println("执行定时任务");
    }

    public static void main(String[] args) {
        TimerTask task = new TimerTest();
        Timer timer = new Timer();
//        timer.schedule(task,new Date(),5000);
        timer.schedule(task,new Date());
    }
}
