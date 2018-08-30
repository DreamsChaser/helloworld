package cn.com.git.leon.designPatterns.factory.factoryMethod.ColorDemo;

/**
 * @author sirius
 * @since 2018/8/30
 */
public class Red implements IColor{
    @Override
    public void paint() {
        System.out.println("涂上红色");
    }
}
