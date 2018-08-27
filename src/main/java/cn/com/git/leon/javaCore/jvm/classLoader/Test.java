package cn.com.git.leon.javaCore.jvm.classLoader;

/**
 * @author sirius
 * @since 2018/8/27
 */
public class Test {
    public static void main(String[] args) {
//        Student.method();
        try {
            Class.forName(Student.class.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
