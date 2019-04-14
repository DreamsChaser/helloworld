package 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.easyFactoryDemo;

import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.color.IColor;
import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.easyFactoryDemo.EasyFactory;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class EasyFactoryTest {
    public static void main(String[] args) {
        IColor iColor = EasyFactory.getColor("red");
        iColor.get();
    }
}
