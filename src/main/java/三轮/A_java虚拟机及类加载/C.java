package 三轮.A_java虚拟机及类加载;

/**
 * @author sirius
 * @since 2019/2/25
 */
public class C {

    static {
        System.out.println("C静态代码块");
    }

    public C() {
        System.out.println("C构造");
    }

    {
        System.out.println("C代码块");
    }

}
