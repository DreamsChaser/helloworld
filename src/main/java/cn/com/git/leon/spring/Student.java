package cn.com.git.leon.spring;

/**
 * @author sirius
 */
public class Student {

    private String name;

    public void say(){
        System.out.println("hello,I'm " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
