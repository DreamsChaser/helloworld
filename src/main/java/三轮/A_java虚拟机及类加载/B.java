package 三轮.A_java虚拟机及类加载;

/**
 * @author sirius
 * @since 2019/2/22
 */
public class B {

    static {
        System.out.println("B静态代码块");
    }

    public B() {
        System.out.println("B构造");
    }

    {
        System.out.println("B代码块");
    }
}
