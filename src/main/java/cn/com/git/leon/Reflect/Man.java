package cn.com.git.leon.Reflect;

/**
 * Created by shinco on 2018/8/17.
 */
public class Man {

    private static int staticValue = 20;

    static {
        System.out.println("静态代码块");
    }

    private int value = 10;

    public void show(){
        System.out.println("static value = "+ staticValue);
        System.out.println("value = " + value);
    }
}
