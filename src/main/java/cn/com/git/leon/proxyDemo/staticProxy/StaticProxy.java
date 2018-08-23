package cn.com.git.leon.proxyDemo.staticProxy;

/**
 * @author sirius
 * @since 2018/8/23
 */
public class StaticProxy implements IService{

    IServiceImpl iServiceImpl;

    public StaticProxy(IServiceImpl iServiceImpl) {
        this.iServiceImpl = iServiceImpl;
    }

    public void doService() {
        System.out.println("方法开始前");
        iServiceImpl.doService();
        System.out.println("方法结束后");
    }
}
