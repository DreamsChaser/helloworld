package 三轮.B_JavaCore.e_codeBlock;

/**
 * @author sirius
 * @since 2019/3/7
 */
public class CodeBlockBean {

    static{
        System.out.println("静态代码块");
    }

    {
        System.out.println("构造代码块");
    }

    public CodeBlockBean() {
        System.out.println("构造方法");
    }

    public void test(){
        {
            System.out.println("普通代码块");
        }
    }
}
