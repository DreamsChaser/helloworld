package 三轮.B_JavaCore.b_keyworld关键字;

/**
 * @author sirius
 * @since 2019/3/7
 */
public class StaticTest {

    public static void main(String[] args) {
        StaticBean staticBean1 = new StaticBean();
        StaticBean staticBean2 = new StaticBean();
        staticBean1.staticField = "1";
        System.out.println(staticBean2.staticField);
    }
}
