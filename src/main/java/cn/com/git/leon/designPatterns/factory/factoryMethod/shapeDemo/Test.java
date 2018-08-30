package cn.com.git.leon.designPatterns.factory.factoryMethod.shapeDemo;

/**
 * @author sirius
 * @since 2018/8/30
 */
public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape iShape = shapeFactory.getShape("CIRCLE");
        iShape.draw();
    }
}
