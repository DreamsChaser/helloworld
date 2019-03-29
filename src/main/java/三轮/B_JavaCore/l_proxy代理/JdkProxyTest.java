package 三轮.B_JavaCore.l_proxy代理;

import cn.com.git.leon.proxyDemo.staticProxy.IService;
import cn.com.git.leon.proxyDemo.staticProxy.IServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author sirius
 * @since 2019/3/29
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        IService iService = new IServiceImpl();
        JdkProxyDemo jdkProxyDemo = new JdkProxyDemo(iService);
        IService service = (IService) Proxy.newProxyInstance(iService.getClass().getClassLoader(), iService.getClass().getInterfaces(),jdkProxyDemo);
        service.doService();
    }
}
