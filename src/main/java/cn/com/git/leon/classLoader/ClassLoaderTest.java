package cn.com.git.leon.classLoader;

/**
 * @author sirius
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            System.out.println("classLoader.loadClass");
            Class clazz = classLoader.loadClass("cn.com.git.leon.classLoader.Father");
            System.out.println("class.forName");
            Class clazz2 = Class.forName("cn.com.git.leon.classLoader.Father");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
