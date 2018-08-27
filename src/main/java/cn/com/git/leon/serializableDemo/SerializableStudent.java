package cn.com.git.leon.serializableDemo;

import java.io.Serializable;

/**
 * @author sirius
 * @since 2018/8/27
 */
public class SerializableStudent implements Serializable{

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say(){
        System.out.println("name = "+name+",age = " +age);
    }
}
