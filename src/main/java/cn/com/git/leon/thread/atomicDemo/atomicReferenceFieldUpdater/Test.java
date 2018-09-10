package cn.com.git.leon.thread.atomicDemo.atomicReferenceFieldUpdater;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * @author sirius
 * @since 2018/9/10
 */
public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "test1";
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AtomicReferenceFieldUpdater.newUpdater(Student.class,String.class,"name");
        atomicReferenceFieldUpdater.compareAndSet(student,student.name,"test2");
        System.out.println(student.name);
        //--------------------
        AtomicReference atomicReference = new AtomicReference(student);
        atomicReference.compareAndSet(student,new Student());

    }
}
