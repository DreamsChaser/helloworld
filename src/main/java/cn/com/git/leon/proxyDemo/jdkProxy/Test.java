package cn.com.git.leon.proxyDemo.jdkProxy;

import java.lang.reflect.Proxy;

/**
 * Created by wangDi on 2018/8/22.
 */
public class Test {
    public static void main(String[] args) {
        IHello hello = new Hello();
        MyProxy myProxy = new MyProxy(hello);
        IHello helloProxy = (IHello) Proxy.newProxyInstance(hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(), myProxy);
        helloProxy.sayHello();
    }
}
