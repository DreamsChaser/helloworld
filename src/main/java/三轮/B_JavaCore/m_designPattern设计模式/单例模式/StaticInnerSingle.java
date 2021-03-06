package 三轮.B_JavaCore.m_designPattern设计模式.单例模式;

/**
 * @author sirius
 * @since 2019/4/12
 */
public class StaticInnerSingle {

    private static class InnerSingle{
        private static final StaticInnerSingle INSTANCE = new StaticInnerSingle();
    }

    private StaticInnerSingle(){}

    public static final StaticInnerSingle getInstance(){
        return InnerSingle.INSTANCE;
    }
}
