package cn.com.git.leon.javaCore.jvm.classLoader;

/**
 * @author sirius
 * @since 2018/8/27
 */
public class Student {

//    static Student student = new Student();

    static int a = 10;
    static int b = 20;

    static {
        System.out.println("静态代码块");
        System.out.println(b);
    }

    {
        System.out.println("实例代码块");
    }

    public Student() {
        System.out.println("构造");
    }

    public static void method(){
        System.out.println("静态方法");
    }
}
