package cn.com.git.leon.designPatterns.factory.easyFactory;

/**
 * @author sirius
 * @since 2018/8/24
 */
public class Test {
    public static void main(String[] args) {
        AbstractFruit fruit = SimpleFruitFactory.getFruit(SimpleFruitFactory.TYPE_APPLE);
        fruit.descFruit();
    }
}
