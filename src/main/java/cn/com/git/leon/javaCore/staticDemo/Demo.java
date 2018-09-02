package cn.com.git.leon.javaCore.staticDemo;

/**
 * @author sirius
 * @since 2018/8/29
 */
public class Demo {

    static {
        c = 1;
        //只能赋值 不能访问
//        System.out.println(c);

    }

    static int c;
}
