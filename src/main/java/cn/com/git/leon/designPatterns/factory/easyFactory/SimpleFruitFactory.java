package cn.com.git.leon.designPatterns.factory.easyFactory;

/**
 * @author sirius
 * @since 2018/8/24
 */
public class SimpleFruitFactory {

    public static final int TYPE_APPLE = 1;

    public static final int TYPE_ORANGE = 2;

    public static final int TYPE_PEACH = 3;

    public static AbstractFruit getFruit(int type){
        switch (type){
            case TYPE_APPLE:
                return new Apple();
            case TYPE_ORANGE:
                return new Orange();
            case TYPE_PEACH:
                return new Peach();
            default:
                return null;
        }
    }
}
