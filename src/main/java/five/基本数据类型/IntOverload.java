package five.基本数据类型;

/**
 * int 溢出
 * @author sirius
 * @since 2018/12/21
 */
public class IntOverload {


    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println(maxValue);
        System.out.println(maxValue + 1);
        System.out.println(maxValue * 2);
        System.out.println(minValue);
        System.out.println(minValue - 1);
        System.out.println(minValue * 2);

    }
}
