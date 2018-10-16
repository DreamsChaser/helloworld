package cn.com.git.leon.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sirius
 * @since 2018/10/16
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayBean bean = new ArrayBean();
        bean.setAge(11);
        bean.setName("王1");
        ArrayBean[] old = new ArrayBean[]{bean};
        //Arrays.copyOf
        ArrayBean[] newArr = Arrays.copyOf(old,2);
        System.out.println(old[0] == newArr[0]);
        System.out.println(old[0].getAge()+"-"+old[0].getName());
        System.out.println(newArr[0].getAge()+"-"+newArr[0].getName());
        newArr[0].setAge(12);
        newArr[0].setName("王2");
        System.out.println(old[0].getAge()+"-"+old[0].getName());
        System.out.println(newArr[0].getAge()+"-"+newArr[0].getName());
    }
}
