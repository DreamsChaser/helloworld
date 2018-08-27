package cn.com.git.leon.designPatterns.factory.factoryMethod;

/**
 * @author sirius
 * @since 2018/8/24
 */
public interface IFruitFactory {
    IFruit createFruit(String type);
}
