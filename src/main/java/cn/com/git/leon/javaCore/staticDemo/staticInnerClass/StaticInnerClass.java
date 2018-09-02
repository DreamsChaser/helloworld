package cn.com.git.leon.javaCore.staticDemo.staticInnerClass;

import cn.com.git.leon.Student;
import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @author sirius
 * @since 2018/9/2
 */
public class StaticInnerClass {

    int a;

    static int b;

    final int c = 0;

    Student student = new Student("sirius","21");

    public static class staticInner{
        public static int aa;
        public void test(){
            System.out.println(aa+b);
        }
    }

    public class inner{
        //不能定义静态变量或静态方法
        public void privateMethod(){
            System.out.println("私有"+c+a);
            System.out.println("jdk8还是只能访问final吗");
            System.out.println(student);
            student = new Student();
            System.out.println(student);
        }
    }

    {
        class test{
            public void test(){
                System.out.println(c+a);
            }
        }
    }
}