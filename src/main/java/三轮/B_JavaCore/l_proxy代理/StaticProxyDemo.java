package 三轮.B_JavaCore.l_proxy代理;

import cn.com.git.leon.proxyDemo.staticProxy.IService;
import cn.com.git.leon.proxyDemo.staticProxy.IServiceImpl;

/**
 * @author sirius
 * @since 2019/3/29
 */
public class StaticProxyDemo implements IService{

    IServiceImpl iServiceImpl;

    public StaticProxyDemo(IServiceImpl iServiceImpl){
        this.iServiceImpl = iServiceImpl;
    }

    @Override
    public void doService() {
        System.out.println("开始调用接口");
        iServiceImpl.doService();
        System.out.println("接口调用完成");
    }
}
