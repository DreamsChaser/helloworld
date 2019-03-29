package 三轮.B_JavaCore.l_proxy代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author sirius
 * @since 2019/3/29
 */
public class JdkProxyDemo implements InvocationHandler {

    /**
     * 被代理对象
     */
    private Object target;

    public JdkProxyDemo(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前");
        Object result = method.invoke(target,args);
        System.out.println("调用后");
        return result;
    }
}
