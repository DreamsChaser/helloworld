package cn.com.git.leon.designPatterns.factory.AbstractFactory;

/**
 * @author sirius
 * @since 2018/8/30
 */
public class Test {
    public static void main(String[] args) {
        FactoryProducer.getFactory("SHAPE").getShape("CIRCLE").draw();
        FactoryProducer.getFactory("COLOR").getColor("RED").paint();
    }
}
