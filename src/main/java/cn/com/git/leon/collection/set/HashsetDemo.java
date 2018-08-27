package cn.com.git.leon.collection.set;

import cn.com.git.leon.Student;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author sirius
 * @since 2018/8/27
 */
public class HashsetDemo {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        Student student = new Student();
        hashSet.add(student);
        System.out.println(hashSet);
        TreeSet treeSet;
    }
}
