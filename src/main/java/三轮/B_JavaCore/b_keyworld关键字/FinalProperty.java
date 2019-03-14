package 三轮.B_JavaCore.b_keyworld关键字;

import 三轮.Bean3;

/**
 * @author sirius
 * @since 2019/2/26
 */
public class FinalProperty {

    public final Bean3 bean3 = new Bean3();

    public final String str = "test";

    /**
     * 修改final对象的值
     */
    public void testModifyFinalValue(){
        System.out.println(bean3.getName());
        bean3.setName("FinalProperty");
        System.out.println(bean3.getName());
    }

    /**
     * final编译阶段赋值
     */
    public void testAssignWhenCompile(){
        System.out.println(str);
    }
    /**
     * final定义入参
     */
    public void testFinalArgs(final Bean3 bean3){
        System.out.println(bean3);
    }
}
