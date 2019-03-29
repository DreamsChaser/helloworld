package 三轮.B_JavaCore.l_proxy代理;

import cn.com.git.leon.proxyDemo.staticProxy.IServiceImpl;

/**
 * @author sirius
 * @since 2019/3/29
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        StaticProxyDemo staticProxyDemo = new StaticProxyDemo(new IServiceImpl());
        staticProxyDemo.doService();
    }
}
