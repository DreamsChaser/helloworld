package cn.com.git.leon.javaCore.finalDemo;

/**
 * @author sirius
 * @since 2018/8/27
 */
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public static void main(String[] args) {
        final Student student = new Student();
        //引用指向的内容可变
        student.setName("test");
        //引用不可变
//        student = new Student();

    }
}
