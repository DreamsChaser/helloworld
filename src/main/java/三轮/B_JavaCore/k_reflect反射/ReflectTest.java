package 三轮.B_JavaCore.k_reflect反射;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author sirius
 * @since 2019/3/29
 */
public class ReflectTest {
    public static void main(String[] args) {
        Class clazz = ReflectData.class;
        for (Field field : clazz.getDeclaredFields()){
            System.out.println(field.getName());
        }

    }
}
