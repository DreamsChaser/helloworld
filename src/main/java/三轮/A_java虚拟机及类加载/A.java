package 三轮.A_java虚拟机及类加载;

/**
 * @author sirius
 * @since 2019/2/22
 */
public class A extends Father{



    static {
        System.out.println("A静态代码块");
    }

    {
        System.out.println("A代码块");
    }

    B b = new B();

    static C c = new C();

    public A() {
        System.out.println("A构造");
    }
}
