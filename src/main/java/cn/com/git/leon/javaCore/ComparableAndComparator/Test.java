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
        SortBean bean1 = new SortBean(1,"id1","name1");
        SortBean bean2 = new SortBean(2,"id1","name1");
        SortBean bean3 = new SortBean(3,"id1","name1");
        Bean bean4 = new Bean(1,"id1","name1");
        Bean bean5 = new Bean(2,"id1","name1");
        Bean bean6 = new Bean(3,"id1","name1");
//        List<SortBean> sortBeanList = new ArrayList<>();
//        sortBeanList.add(bean2);
//        sortBeanList.add(bean1);
//        sortBeanList.add(bean3);
//        System.out.println(JSON.toJSON(sortBeanList));
//        Collections.sort(sortBeanList);
//        System.out.println(JSON.toJSON(sortBeanList));
        List<Bean> beanList = new ArrayList<>();
        beanList.add(bean5);
        beanList.add(bean4);
        beanList.add(bean6);
        System.out.println(JSON.toJSON(beanList));
//        Collections.sort(beanList,new ComparatorDemo());
        Collections.sort(beanList,(Bean b1,Bean b2) ->b1.getIntValue()-b2.getIntValue());
        System.out.println(JSON.toJSON(beanList));
    }
}
