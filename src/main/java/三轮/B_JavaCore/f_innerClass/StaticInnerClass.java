package 三轮.B_JavaCore.f_innerClass;

/**
 * @author sirius
 * @since 2019/3/8
 */
public class StaticInnerClass {

    int a;

    final int b = 2;

    static int c;

    public static class StaticInner{

        public void show() {
            c = 10;
        }

    }
}
