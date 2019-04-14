package 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.abstractFactory;

import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.Bound.IBound;
import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.color.IColor;

/**
 * @author sirius
 * @since 2019/4/14
 */
public interface IFactory {

    IBound getBound(String bound);

    IColor getColor(String color);
}
