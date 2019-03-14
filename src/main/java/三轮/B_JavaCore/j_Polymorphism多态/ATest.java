package 三轮.B_JavaCore.j_Polymorphism多态;

/**
 * this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)
 * @author sirius
 * @since 2019/3/14
 */
public class ATest {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        a1.show(b);//this.show() A and A
        a1.show(c);//this.show() A and A
        a1.show(d);//this.show() A and D
        //  比如④，a2.show(b)，a2是一个引用变量，类型为A，则this为a2，b是B的一个实例，
        // 于是它到类A里面找show(B obj)方法，没有找到，
        // 于是到A的super(超类)找，而A没有超类，因此转到第三优先级this.show((super)O)，
        // this仍然是a2，这里O为B，(super)O即(super)B即A，因此它到类A里面找show(A obj)的方法，
        // 类A有这个方法，但是由于a2引用的是类B的一个对象，B覆盖了A的show(A obj)方法，
        // 因此最终锁定到类B的show(A obj)，输出为"B and A”。
        a2.show(b);
        System.out.println("----------");
        //A.SHOW(C)->无->A.SHOW(B)
        a2.show(c);
        a2.show(d);//this.show() A and D
        b.show(b);//this.show() B and B
        b.show(c);//this.show(super) B and B
        b.show(d);//super.show() A and D
    }
}
