package 三轮.B_JavaCore.m_designPattern设计模式.工厂模式.abstractFactory;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class FactoryProducer {

    public static IFactory getFactory(String type){
        IFactory iFactory = null;
        if ("COLOR".equals(type)){
            iFactory = new ColorFactory();
        }else if ("BOUND".equals(type)){
            iFactory = new BoundFactory();
        }
        return iFactory;
    }

}
