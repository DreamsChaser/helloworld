package 三轮.B_JavaCore.m_designPattern设计模式.单例模式;

/**
 * @author sirius
 * @since 2019/4/12
 */
public class DoubleCheckedLockingSingle {

    private volatile DoubleCheckedLockingSingle doubleCheckedLockingSingle;

    private DoubleCheckedLockingSingle(){}

    public DoubleCheckedLockingSingle getInstance(){
        if (doubleCheckedLockingSingle == null){
            synchronized (this){
                if (doubleCheckedLockingSingle == null){
                    doubleCheckedLockingSingle = new DoubleCheckedLockingSingle();
                }
            }
        }
        return doubleCheckedLockingSingle;
    }

}
