package cn.com.git.leon.javaCore.exceptionAndCore.stackOverflowError;

/**
 * @author sirius
 * @since 2018/8/31
 */
public class Test {

    public static void stackOverflow(){
        stackOverflow();
    }

    public static void main(String[] args) {
        Test.stackOverflow();
    }
}
