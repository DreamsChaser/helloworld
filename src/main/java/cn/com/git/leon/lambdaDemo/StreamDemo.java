package cn.com.git.leon.lambdaDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author sirius
 * @since 2018/9/11
 */
public class StreamDemo {

    public static void main(String[] args) {
        Student student1 = new Student("张三",12);
        Student student2 = new Student("张三",14);
        Student student3 = new Student("张三",17);
        Student student4 = new Student("王五",12);
        Student student5 = new Student("李四",12);
        Student student6 = new Student("王五",12);
        Student student7 = new Student("中神通",12);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        System.out.println(list);
        List list2 = list.stream().filter(distinctByKey(Student::getName)).collect(Collectors.toList());
        System.out.println(list2);
    }


    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

}
