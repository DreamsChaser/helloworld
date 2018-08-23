package cn.com.git.leon.proxyDemo.staticProxy;

/**
 * @author sirius
 * @since 2018/8/23
 */
public class Test {
    public static void main(String[] args) {
        StaticProxy proxy = new StaticProxy(new IServiceImpl());
        proxy.doService();
    }
}
