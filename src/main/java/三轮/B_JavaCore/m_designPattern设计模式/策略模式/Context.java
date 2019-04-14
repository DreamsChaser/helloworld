package 三轮.B_JavaCore.m_designPattern设计模式.策略模式;

/**
 * 持有策略的类
 * @author sirius
 * @since 2019/4/14
 */
public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void useStrategy(){
        iStrategy.doService();
    }

}
