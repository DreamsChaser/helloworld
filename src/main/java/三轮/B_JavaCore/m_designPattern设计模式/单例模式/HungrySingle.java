package 三轮.B_JavaCore.m_designPattern设计模式.单例模式;

import java.io.Serializable;

/**
 * @author sirius
 * @since 2019/4/12
 */
public class HungrySingle implements Serializable{

    private static HungrySingle hungrySingle = new HungrySingle();

    private HungrySingle(){}

    public static HungrySingle getInstance(){
        return hungrySingle;
    }
}
