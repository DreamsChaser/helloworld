package 三轮.B_JavaCore.m_designPattern设计模式.策略模式;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class StrategyTest {

    public static void main(String[] args) {
        new Context(new AStrategy()).useStrategy();
        new Context(new BStrategy()).useStrategy();

    }
}
