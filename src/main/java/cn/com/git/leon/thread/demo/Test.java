package cn.com.git.leon.thread.demo;

/**
 * @author sirius
 * @since 2018/9/9
 */
public class Test {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("AB");
        stringBuffer.delete(0,1);
        System.out.println(stringBuffer.toString());
    }
}
