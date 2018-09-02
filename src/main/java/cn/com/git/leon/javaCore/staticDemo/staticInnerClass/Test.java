package cn.com.git.leon.javaCore.staticDemo.staticInnerClass;

/**
 * @author sirius
 * @since 2018/9/2
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(StaticInnerClass.staticInner.aa);
        StaticInnerClass clazz = new StaticInnerClass();
        StaticInnerClass.staticInner staticInner = new StaticInnerClass.staticInner();
        StaticInnerClass.inner inner = clazz.new inner();
        inner.privateMethod();

    }
}
