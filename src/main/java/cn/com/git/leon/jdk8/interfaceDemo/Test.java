package cn.com.git.leon.jdk8.interfaceDemo;

/**
 * @author sirius
 * @since 2018/10/26
 */
public class Test {
    public static void main(String[] args) {
        TestInterface.staticMethod();
        new TestInterfaceImpl().defaultMethod();
    }
}
