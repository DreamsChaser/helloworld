package cn.com.git.leon.designPatterns.factory.factoryMethod.ColorDemo;

import cn.com.git.leon.designPatterns.factory.AbstractFactory.AbstractFactory;
import cn.com.git.leon.designPatterns.factory.factoryMethod.shapeDemo.IShape;

/**
 * @author sirius
 * @since 2018/8/30
 */
public class ColorFactory extends AbstractFactory{

    public IColor getColor(String type){
        if (type.equals("RED")){
            return new Red();
        }else if (type.equals("GREEN")){
            return new Green();
        }else if (type.equals("YELLOW")){
            return new Yellow();
        }else {
            return null;
        }
    }

    @Override
    public IShape getShape(String type) {
        return null;
    }
}
