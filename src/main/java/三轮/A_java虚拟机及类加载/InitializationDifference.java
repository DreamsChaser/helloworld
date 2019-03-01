package 三轮.A_java虚拟机及类加载;

/**
 * 初始化的不同
 * Class.forName和ClassLoad.loadClass
 * @author sirius
 * @since 2019/2/22
 */
public class InitializationDifference {

    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try {
            classLoader.loadClass("三轮.A_java虚拟机及类加载.A");
            System.out.println("--------");
            Class.forName("三轮.A_java虚拟机及类加载.A");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
