package 三轮.B_JavaCore.m_designPattern设计模式.单例模式;

import java.util.concurrent.TimeUnit;

/**
 * @author sirius
 * @since 2019/4/12
 */
public class LazySingle {

    private static LazySingle lazySingle;

    private LazySingle(){}

    public static LazySingle getInstance(){
        if (lazySingle == null){
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }
}
