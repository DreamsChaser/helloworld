package 三轮.A_java虚拟机及类加载;

/**
 * 类实例化顺序 以及各种变量能否访问的问题
 * 先父后子，先静后常再构造
   同等级内代码逐条按顺序执行
 * 当静态代码和非静态代码中成员变量包含对象，也会先执行该对象类的静态代码和构造函数

 * @author sirius
 * @since 2019/2/22
 */
public class ClassLoadOrder{
    public static void main(String[] args) {
        System.out.println("hello world");
        /**
         * 先父后子,先静后常最后构造(父类先初始化)，同一层级按代码顺序
         */
        /**
         * 例如:父静态代码块->(子)A静态代码块->(子A静态变量C)C静态代码块->C代码块->C构造
         * ->父普通代码块->父构造->(子)A代码块->(子)A普通成员变量B静态代码块
         * ->B普通代码块->B构造->(子)A构造
         */
        A a = new A();
//        A.inner inner = new A.inner();
    }
}
