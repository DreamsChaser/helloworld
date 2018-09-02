package cn.com.git.leon.javaCore.duotaiDemo;

/**
 * @author sirius
 * @since 2018/9/2
 */
public class Test {

    public static void main(String[] args) {
        Father father = new Son();
        father.publicMethod();
        Father father1 = new GrandSon();
        father1.publicMethod();
        father.abstractMethod();
        Father father2 = new Son2();
        father2.publicMethod();
    }
}
