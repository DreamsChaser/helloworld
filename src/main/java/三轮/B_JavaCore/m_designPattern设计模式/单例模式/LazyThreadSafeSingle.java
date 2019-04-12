package 三轮.B_JavaCore.m_designPattern设计模式.单例模式;

/**
 * @author sirius
 * @since 2019/4/12
 */
public class LazyThreadSafeSingle {

    private static LazyThreadSafeSingle lazyThreadSafeSingle;

    private LazyThreadSafeSingle(){}

    public static synchronized LazyThreadSafeSingle getInstance(){
        if (lazyThreadSafeSingle == null){
            lazyThreadSafeSingle = new LazyThreadSafeSingle();
        }
        return lazyThreadSafeSingle;
    }


}
