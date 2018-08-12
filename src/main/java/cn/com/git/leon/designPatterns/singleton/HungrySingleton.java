package cn.com.git.leon.designPatterns.singleton;

/**
 * Created by wangDi on 2018/8/12.
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton (){}
    public static HungrySingleton getInstance() {
        return instance;
    }
}
