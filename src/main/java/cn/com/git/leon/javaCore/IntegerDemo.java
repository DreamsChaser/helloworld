package cn.com.git.leon.javaCore;

/**
 * @author sirius
 * @since 2018/8/31
 */
public class IntegerDemo {
    public static void main(String[] args) {
        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);
        Integer integer3 = 1;
        Integer integer4 = 1;
        Integer integer5 = -129;
        Integer integer6 = -129;
        System.out.println(integer1 == integer2);
        System.out.println(integer3 == integer4);
        System.out.println(integer5 == integer6);
    }
}
