package 三轮.B_JavaCore.c_packgeType包装类型;

/**
 * @author sirius
 * @since 2019/2/28
 */
public class AutoBoxing {

    public static void main(String[] args) {
        /**
         * ==的缓存
         */
        Integer i = 1;
        Integer j = 1;
        Integer m = 128;
        Integer n = 128;
        System.out.println(i == j);
        System.out.println(m == n);
    }
}
