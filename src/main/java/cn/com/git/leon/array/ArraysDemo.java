package cn.com.git.leon.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sirius
 * @since 2018/10/16
 */
public class ArraysDemo {
    public static void main(String[] args) {
        ArrayBean bean = new ArrayBean();
        bean.setAge(11);
        bean.setName("test");
        ArrayBean[] array1 = {bean};
        ArrayBean[] array2 = new ArrayBean[]{};
        ArrayBean[] array3 = new ArrayBean[1];
        array2 = Arrays.copyOf(array1,15);
        System.arraycopy(array1,0,array3,0,array1.length);
        ArrayBean bean1 = array1[0];
        ArrayBean bean2 = array2[0];
        ArrayBean bean3 = array3[0];
        System.out.println(bean);
        System.out.println(bean2);
        System.out.println(bean3);
        System.out.println(bean.getName() == bean2.getName());
        System.out.println(bean.getName() == bean3.getName());
        System.out.println(bean.getAge()+"-"+bean1.getAge()+"-"+bean2.getAge()+"-"+bean3.getAge());
        System.out.println(bean.getName()+"-"+bean1.getName()+"-"+bean2.getName()+"-"+bean3.getName());
        //arrayList中扩容中的Arrays.copyOf即System.arraycopy是浅拷贝
        bean1.setName("改了");
        bean2.setAge(2);
        System.out.println(bean.getAge()+"-"+bean1.getAge()+"-"+bean2.getAge()+"-"+bean3.getAge());
        System.out.println(bean.getName()+"-"+bean1.getName()+"-"+bean2.getName()+"-"+bean3.getName());

    }
}
