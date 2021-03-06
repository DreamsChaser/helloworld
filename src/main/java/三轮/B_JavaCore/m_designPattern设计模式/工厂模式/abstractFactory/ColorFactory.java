package 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.abstractFactory;

import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.Bound.IBound;
import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.color.Black;
import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.color.IColor;
import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.color.Red;
import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.color.White;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class ColorFactory implements IFactory{
    @Override
    public IBound getBound(String bound) {
        return null;
    }

    @Override
    public IColor getColor(String color) {
        IColor iColor = null;
        if ("red".equals(color)){
            iColor = new Red();
        }else if ("white".equals(color)){
            iColor = new White();
        }else if ("black".equals(color)){
            iColor = new Black();
        }
        return iColor;
    }
}
