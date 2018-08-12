package cn.com.git.leon.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author sirius
 */
public class reflectUtils {

    public static void main(String[] args) {
        /**
         * 创建类实例的三种方式
         */
        Person person = new Person();
        person.setAge(18);
        person.setName("sirius");
        System.out.println(person.getClass().getName());
        try {
            //1、Class.forName
            Class clazz = Class.forName(person.getClass().getName());
            //2、getClass
            Person p = new Person();
            Class clazz2 = p.getClass();
            //3、类.class
            Class clazz3 = Person.class;
            System.out.println(clazz == clazz2 && clazz == clazz3);
            /**
             * 反射获取对象的属性和方法
             */
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields){
                field.setAccessible(true);
            }
            Method[] methods = clazz.getDeclaredMethods();
            Method method = clazz.getMethod("speak");
            method.invoke(person);
            /**
             * 反射获取构造器
             */
            Constructor[] constructors = clazz.getConstructors();
            Constructor constructor = clazz.getDeclaredConstructor();
            Person person1 = (Person) constructor.newInstance();
            Constructor constructor1 = clazz.getConstructor(String.class);
            Person person2 = (Person)constructor1.newInstance("sirius");
            Constructor constructor2 = clazz.getConstructor(String.class,int.class);
            Person person3 = (Person)constructor2.newInstance("sirius",18);
            person1.speak();
            /**
             * new 和 new instance
             */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
