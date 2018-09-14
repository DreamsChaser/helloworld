package cn.com.git.leon.classLoader;

/**
 * @author sirius
 * @since 2018/9/14
 */
public class CustomerClassTest {
    public static void main(String[] args) {
        CustomerClassLoader customerClassLoader = new CustomerClassLoader();
        try {
            Class<?> clazz = Class.forName("cn.com.git.leon.classLoader.CustomerBean",true,customerClassLoader);
            Object o = clazz.newInstance();
            System.out.println(o);
            System.out.println(clazz.getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
