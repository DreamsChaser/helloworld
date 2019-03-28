package cn.com.git.leon;

import cn.com.git.leon.designPatterns.factory.factoryMethod.ColorDemo.IColor;
import cn.com.git.leon.designPatterns.factory.factoryMethod.IFruit;

import java.lang.reflect.Method;

/**
 * @author sirius
 * @since 2019/3/28
 */
public class ReflectTest {

    public static void main(String[] args) {
        Method[] methods = IColor.class.getDeclaredMethods();
        System.out.println(methods[0].getName());
    }

}
