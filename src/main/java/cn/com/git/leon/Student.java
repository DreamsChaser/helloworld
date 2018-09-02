package cn.com.git.leon;

/**
 * Created by shinco on 2018/8/10.
 */
public class Student {
    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }
}
