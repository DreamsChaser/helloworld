package 三轮.B_JavaCore.l_proxy代理;

import cn.com.git.leon.proxyDemo.staticProxy.IService;
import cn.com.git.leon.proxyDemo.staticProxy.IServiceImpl;

/**
 * @author sirius
 * @since 2019/3/29
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        IService iService = new IServiceImpl();
        CglibProxyDemo cglibProxyDemo = new CglibProxyDemo();

        IService service1 = (IService) cglibProxyDemo.getInstance(iService);
//        service1.doService();

        IService service2 = (IService) cglibProxyDemo.getInstance(IService.class);
        service2.doService();

        IService service3 = (IService) cglibProxyDemo.getInstance(IServiceImpl.class);
//        service3.doService();
    }
}
