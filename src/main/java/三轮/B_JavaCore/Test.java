package 三轮.B_JavaCore;

/**
 * @author sirius
 * @since 2019/2/26
 */
public class Test {

    public static void main(String[] args) {
        String str = "ab";
        String str1 = new String("a");
        String str2 = new String("b");
        String str3 = new String("a") + new String("b");
        System.out.println(str == str1 + str2);
        System.out.println(str == str3);
        System.out.println(str1+str2 == str3);
    }
}
