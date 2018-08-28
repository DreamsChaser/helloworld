package cn.com.git.leon.proxyDemo.cglibDemo;

import cn.com.git.leon.proxyDemo.jdkProxy.IHello;

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
        /**
         * cglib代理接口
         */
        IHello iHello = (IHello) cglib.getInstance(IHello.class);
        iHello.sayHello();
    }

}
