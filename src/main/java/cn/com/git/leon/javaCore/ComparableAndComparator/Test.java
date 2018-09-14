package cn.com.git.leon.javaCore.ComparableAndComparator;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sirius
 * @since 2018/9/14
 */
public class Test {
    public static void main(String[] args) {
        ComparableDemo demo0 = new ComparableDemo(1);
        ComparableDemo demo1 = new ComparableDemo(-1);
        ComparableDemo demo2 = new ComparableDemo(3);
        List<ComparableDemo> list = new ArrayList<>();
        list.add(demo0);
        list.add(demo1);
        list.add(demo2);
        System.out.println(JSON.toJSONString(list));
        System.out.println(demo0.compareTo(demo1));
    }
}
