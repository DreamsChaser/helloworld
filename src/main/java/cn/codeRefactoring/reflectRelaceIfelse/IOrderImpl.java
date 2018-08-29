package cn.codeRefactoring.reflectRelaceIfelse;

import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @author sirius
 * @since 2018/8/29
 */
public class IOrderImpl implements IOrder{

    private static HashMap<Integer,String> methodMap = new HashMap<Integer,String>();

    static {
        methodMap.put(1,"doFreeOrder");
        methodMap.put(2,"doCreditsOrder");
        methodMap.put(3,"doMoneyOrder");
    }

    @Override
    public void doOrder(String type) {
        String methodName = methodMap.get(type);
        try {
            Method method = IOrderImpl.class.getMethod(methodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    private void doFreeOrder(){

    }

    private void doCreditsOrder(){

    }

    private void doMoneyOrder(){

    }
}
