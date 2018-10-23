package cn.com.git.leon.thread.lockDemo.ReadWriteLockDemo;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author sirius
 * @since 2018/10/23
 */
public class Data {

    private int data;

    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void getData() {
        readWriteLock.readLock().lock();
        try {
            System.out.println("正在读数据");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("读取的数据为:" + data);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            readWriteLock.readLock().unlock();
        }
    }

    public void setData(int data) {
        readWriteLock.writeLock().lock();
        try {
            System.out.println("正在写数据");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("写入的数据为:" + data);
            this.data = data;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            readWriteLock.writeLock().unlock();
        }
    }
}
