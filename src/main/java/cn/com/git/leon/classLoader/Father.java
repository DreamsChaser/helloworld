package cn.com.git.leon.classLoader;

/**
 * @author sirius
 */
public class Father {

    private static int a = 1;

    private int b = init();

    {
        System.out.println("父类构造代码块");
    }

    static {
        System.out.println("父类静态代码块");
        System.out.println("a的值"+a);
    }

    public Father(){
        System.out.println("父类构造方法");
    }

    public int init(){
        System.out.println("父类成员变量赋值");
        b= 100;
        System.out.println(b);
        return b;
    }
}
