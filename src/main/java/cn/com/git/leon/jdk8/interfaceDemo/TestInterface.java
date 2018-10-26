package cn.com.git.leon.jdk8.interfaceDemo;

/**
 * @author sirius
 * @since 2018/10/26
 */
public interface TestInterface {

    public static void staticMethod(){
        System.out.println("我是静态方法");
    }

    default void defaultMethod(){
        System.out.println("我是默认方法");
    }
}
