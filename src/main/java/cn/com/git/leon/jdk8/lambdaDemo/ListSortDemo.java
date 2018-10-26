package cn.com.git.leon.jdk8.lambdaDemo;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author sirius
 * @since 2018/9/11
 */
public class ListSortDemo {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setAge(14);
        student.setName("同学1");
        Student student2 = new Student();
        student2.setAge(16);
        student2.setName("同学2");
        Student student3 = new Student();
        student3.setAge(19);
        student3.setName("同学3");
        list.add(student3);
        list.add(student);
        list.add(student2);
        //----------------------
        System.out.println(JSON.toJSONString(list));
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(JSON.toJSONString(list));
        //用lambda表达式
        Collections.sort(list,(Student o1, Student o2)->o2.getAge()-o1.getAge());
        System.out.println(JSON.toJSONString(list));
    }

}
