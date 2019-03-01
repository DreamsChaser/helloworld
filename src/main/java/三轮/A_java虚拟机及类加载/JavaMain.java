package 三轮.A_java虚拟机及类加载;

import 三轮.Bean3;

/**
 * @author sirius
 * @since 2019/2/21
 */
public class JavaMain {

    public static void main(String[] args) {
//        ClassLoader cl = ClassLoader.getSystemClassLoader();
//        try {
//            cl.loadClass("三轮.Bean3");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        try {
            Class.forName("三轮.Bean3");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
