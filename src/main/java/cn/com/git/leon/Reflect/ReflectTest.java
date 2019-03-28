package cn.com.git.leon.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

/**
 * @author sirius
 * @since 2019/3/28
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException {

        /**
        for (Field field : Key.class.getDeclaredFields()){
            Type genericType = field.getGenericType();
            if(genericType == null) continue;
            // 如果是泛型参数的类型
            if(genericType instanceof ParameterizedType){
                ParameterizedType pt = (ParameterizedType) genericType;
                //得到泛型里的class类型对象
                Class<?> accountPrincipalApproveClazz = (Class<?>)pt.getActualTypeArguments()[0];
                System.out.println(accountPrincipalApproveClazz.getSimpleName());
            }
        }
         */

        Method method = IFuture.class.getDeclaredMethods()[0];
        System.out.println(method.getReturnType());
        Type[] type = method.getGenericParameterTypes();
        for (Type type1 : type) {
            if (type1 instanceof ParameterizedType) {
                System.out.println("是");
            }else {
                System.out.println("否");
            }
        }
    }
}
