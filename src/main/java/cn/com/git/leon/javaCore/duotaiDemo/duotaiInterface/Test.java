package cn.com.git.leon.javaCore.duotaiDemo.duotaiInterface;

/**
 * @author sirius
 * @since 2018/9/3
 */
public class Test {
    public static void main(String[] args) {
        IService iService = new AServiceImpl();
        iService.doService();
        IService iService2 = new BServiceImpl();
        iService2.doService();
    }
}
