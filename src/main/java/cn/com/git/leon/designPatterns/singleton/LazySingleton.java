package cn.com.git.leon.designPatterns.singleton;

/**
 * Created by wangDi on 2018/8/12.
 */
public class LazySingleton {

    private static LazySingleton instance;
    private LazySingleton (){}

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
