package cn.com.git.leon.designPatterns.singleton;

/**
 * @author sirius
 * @since 2018/8/28
 */
public class Test {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton);
        System.out.println(lazySingleton2);
    }
}
