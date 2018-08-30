package cn.com.git.leon.designPatterns.factory.AbstractFactory;

import cn.com.git.leon.designPatterns.factory.factoryMethod.ColorDemo.IColor;
import cn.com.git.leon.designPatterns.factory.factoryMethod.shapeDemo.IShape;

/**
 * @author sirius
 * @since 2018/8/30
 */
public abstract class AbstractFactory {
    public abstract IColor getColor(String type);
    public abstract IShape getShape(String type);
}
