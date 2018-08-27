package cn.com.git.leon.designPatterns.factory.factoryMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sirius
 * @since 2018/8/24
 */
public class IFruitFactoryImpl implements IFruitFactory{

    public IFruit createFruit(String type) {
        // 这里的方式是：消费者知道自己想要什么产品；若生产何种产品完全由工厂决定，则这里不应该传入控制生产的参数。
        IFruit iFruit;
        Map<String,Object> map = new HashMap<String,Object>();
        if (type.equals("APPLE")){
            map.put("APPLE",5);
        }else if (type.equals("PEACH")){
            map.put("PEACH",10);
        }else if (type.equals("ORANGE")){
            map.put("ORANGE",15);
        }else {
            map.put("ORANGE",15);
        }
        return null;
    }
}
