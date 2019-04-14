package 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.FactoryMethodDemo;

import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.color.IColor;

/**
 * @author sirius
 * @since 2019/4/14
 */
public interface IFactory {

    IColor getColor(String color);

}
