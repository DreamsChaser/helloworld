package cn.com.git.leon.proxyDemo.cglibDemo;

/**
 * @author sirius
 */
public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        StudentCglib cglib = new StudentCglib();
        Student student1 = (Student) cglib.getInstance(student);
        student1.setName("wd");
        student1.sayHello();
    }

}
