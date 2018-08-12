package cn.com.git.leon.designPatterns.singleton;

/**
 * Created by wangDi on 2018/8/12.
 */
public class StaticInnerSingleton {
    private static class SingletonInner {
        private static final SingletonInner INSTANCE = new SingletonInner();
    }
    private StaticInnerSingleton (){}
    public static final SingletonInner getInstance() {
        return SingletonInner.INSTANCE;
    }
}
