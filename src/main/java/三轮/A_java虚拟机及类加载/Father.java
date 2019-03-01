package 三轮.A_java虚拟机及类加载;

/**
 * @author sirius
 * @since 2019/2/22
 */
public class Father {

    {
        System.out.println("父类普通代码块");
    }

    static {
        System.out.println("父类静态代码块");
    }

    public Father() {
        System.out.println("父类构造方法");
    }
}
