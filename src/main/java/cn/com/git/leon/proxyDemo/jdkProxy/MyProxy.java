package cn.com.git.leon.proxyDemo.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by wangDi on 2018/8/22.
 */
public class MyProxy implements InvocationHandler{

    /**
     * 要代理的对象
     */
    private Object target;

    public MyProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前");
        Object result = method.invoke(target,args);
        System.out.println("调用后");
        return result;
    }
}
