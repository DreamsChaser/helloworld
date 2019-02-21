package cn.com.git.leon.util;

import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author sirius
 * @since 2019/1/17
 */
public class BeanMapperUtil {

    public static <T> T map(Object source, Class<T> destinationClass) throws Exception {
        T destination = destinationClass.newInstance();
        Method[] desMethods = destinationClass.getMethods();
        Method[] srcMethods = source.getClass().getMethods();
        for (Method srcMethod : srcMethods) {
            String srcName = srcMethod.getName();
            if (srcName.startsWith("get")) {
                Object value = srcMethod.invoke(source);
                if (value != null) {
                    for (Method desMethod : desMethods) {
                        String desName = desMethod.getName();
                        if (desName.startsWith("set") && srcName.substring(3).equals(desName.substring(3))
                                && srcMethod.getGenericReturnType() == desMethod.getParameterTypes()[0]) {
                            desMethod.invoke(destination, value);
                            break;
                        }
                    }
                }
            }
        }
        return destination;
    }

    public static void main(String[] args) {
        Field[] fields = A.class.getDeclaredFields();
        System.out.println("");
    }
}

class AA{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class A extends AA implements Serializable{

    private static final long serialVersionUId = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class B{
    private Long name;

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }
}
