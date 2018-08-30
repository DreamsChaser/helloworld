package cn.com.git.leon.designPatterns.factory.factoryMethod.shapeDemo;

import cn.com.git.leon.designPatterns.factory.AbstractFactory.AbstractFactory;
import cn.com.git.leon.designPatterns.factory.factoryMethod.ColorDemo.IColor;

/**
 * @author sirius
 * @since 2018/8/30
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public IColor getColor(String type) {
        return null;
    }

    public IShape getShape(String type){
        if (type.equals("CIRCLE")){
            return new Circle();
        }else if (type.equals("TRIANGLE")){
            return new Triangle();
        }else if (type.equals("SQUARE")){
            return new Square();
        }else {
            return null;
        }
    }
}
