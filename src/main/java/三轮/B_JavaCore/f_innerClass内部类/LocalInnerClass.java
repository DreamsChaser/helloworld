package 三轮.B_JavaCore.f_innerClass内部类;

/**
 * @author sirius
 * @since 2019/3/11
 */
public class LocalInnerClass {

    String str1 = "1";

    final String str3 = "2";

    public void outMethod(){
        String str = "1";
        final String str2 = "a";
        class LocalInner{
            public void test(){
                System.out.println(str1 + str3);
            }
        }
        new LocalInner().test();

    }

}
