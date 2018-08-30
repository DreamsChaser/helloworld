package cn.com.git.leon.designPatterns.factory.factoryMethod.shapeDemo;

/**
 * @author sirius
 * @since 2018/8/30
 */
public class Square implements IShape{
    @Override
    public void draw() {
        System.out.println("draw a square");
    }
}
