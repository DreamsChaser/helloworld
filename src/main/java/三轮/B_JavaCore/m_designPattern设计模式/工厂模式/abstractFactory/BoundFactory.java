package 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.abstractFactory;

import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.Bound.Audi;
import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.Bound.Benz;
import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.Bound.Bmw;
import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.Bound.IBound;
import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.color.Black;
import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.color.IColor;
import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.color.Red;
import 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.color.White;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class BoundFactory implements IFactory{
    @Override
    public IBound getBound(String bound) {
        IBound iBound = null;
        if ("benz".equals(bound)){
            iBound = new Benz();
        }else if ("bmw".equals(bound)){
            iBound = new Bmw();
        }else if ("audi".equals(bound)){
            iBound = new Audi();
        }
        return iBound;
    }

    @Override
    public IColor getColor(String color) {
        return null;
    }
}
