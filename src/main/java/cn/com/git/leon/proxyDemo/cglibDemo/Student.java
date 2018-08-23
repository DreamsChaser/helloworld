package cn.com.git.leon.proxyDemo.cglibDemo;

/**
 * @author sirius
 */
public class Student {

    private String name;

    public void sayHello(){
        System.out.println("hello,I'm" + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
