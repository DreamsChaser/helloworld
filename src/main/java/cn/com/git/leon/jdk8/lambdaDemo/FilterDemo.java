package cn.com.git.leon.jdk8.lambdaDemo;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sirius
 * @since 2018/9/11
 */
public class FilterDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        Student student = new Student("同学1",15);
        Student student2 = new Student("同学2",11);
        Student student3 = new Student("同学3",19);
        Student student4 = new Student("同学4",6);
        list.add(student);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        System.out.println(JSON.toJSONString(list));
        //----------------------
        list.stream().filter(s -> s.getAge()>10).forEach(s -> System.out.println(s.getName()));
    }
}
