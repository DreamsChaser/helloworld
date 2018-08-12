package cn.com.git.leon.designPatterns;

import cn.com.git.leon.designPatterns.singleton.EnumSingleton;
import cn.com.git.leon.designPatterns.singleton.HungrySingleton;
import cn.com.git.leon.designPatterns.singleton.LazySingleton;

/**
 * Created by wangDi on 2018/8/12.
 */
public class Test {
    public static void main(String[] args) {
//        HungrySingleton lazySingleton = HungrySingleton.getInstance();
//        HungrySingleton lazySingleton2 = HungrySingleton.getInstance();
//        System.out.println(lazySingleton == lazySingleton2);
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
    }
}
