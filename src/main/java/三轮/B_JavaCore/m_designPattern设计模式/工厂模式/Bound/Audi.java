package 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.Bound;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class Audi implements IBound{
    @Override
    public void get() {
        System.out.println("奥迪");
    }
}
