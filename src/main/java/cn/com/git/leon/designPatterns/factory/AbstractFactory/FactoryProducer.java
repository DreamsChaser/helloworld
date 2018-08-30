package cn.com.git.leon.designPatterns.factory.AbstractFactory;

import cn.com.git.leon.designPatterns.factory.factoryMethod.ColorDemo.ColorFactory;
import cn.com.git.leon.designPatterns.factory.factoryMethod.shapeDemo.ShapeFactory;

/**
 * @author sirius
 * @since 2018/8/30
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        if (type.equals("SHAPE")){
            return new ShapeFactory();
        } else if (type.equals("COLOR")){
            return new ColorFactory();
        }else {
            return null;
        }
    }
}
