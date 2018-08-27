package cn.com.git.leon.javaCore.finalDemo;

/**
 * @author sirius
 * @since 2018/8/27
 */
public class FinalDemo {
    int a = 10;

    int b = 20;

    final int c = a;

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        finalDemo.a = 30;
        System.out.println("a: "+finalDemo.a);
        System.out.println("b: "+finalDemo.b);
        System.out.println("c: "+finalDemo.c);
    }
}
