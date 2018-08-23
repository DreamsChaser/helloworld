package cn.com.git.leon.proxyDemo.cglibDemo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author sirius
 */
public class StudentCglib implements MethodInterceptor{

    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        //设置父类对象
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallbackType(this.getClass());
        //回调方法
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法开始前");
        methodProxy.invokeSuper(o,objects);
        System.out.println("方法结束后");
        return null;
    }


}
