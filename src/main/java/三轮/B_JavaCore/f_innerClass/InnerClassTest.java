package 三轮.B_JavaCore.f_innerClass;

/**
 * @author sirius
 * @since 2019/3/11
 */
public class InnerClassTest {
    public static void main(String[] args) {
        /**
         * 成员内部类的实例化通过外部类的示例.new
         */
        MemberInnerClass memberInnerClass = new MemberInnerClass();
        MemberInnerClass.MemberInner memberInner = memberInnerClass.new MemberInner();
        /**
         * 静态内部类的实例化通过new 外部类.内部类
         */
        StaticInnerClass.StaticInner staticInner = new StaticInnerClass.StaticInner();
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.outMethod();
    }
}
