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
             * newInstance: 弱类型。低效率。只能调用无参构造。
             * new: 强类型。相对高效。能调用任何public构造。
             */
            /**
             * Class.forName和ClassLoader的区别
             */

            Class clazz4 = Class.forName(Man.class.getName());
            Man man = (Man)clazz4.newInstance();
            man.show();
            Class clazz5 = Man.class.getClassLoader().loadClass(Man.class.getName());
            Man man2 = (Man)clazz5.newInstance();
            man2.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
