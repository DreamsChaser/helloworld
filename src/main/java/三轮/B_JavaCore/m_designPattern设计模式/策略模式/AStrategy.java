package 三轮.B_JavaCore.m_designPattern设计模式.策略模式;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class AStrategy implements IStrategy{

    @Override
    public void doService() {
        System.out.println("执行A分支");
    }
}
