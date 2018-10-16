package cn.com.git.leon.copy;

/**
 * @author sirius
 * @since 2018/10/16
 */
public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(11);
        student.setName("王1");
        Student student2 = new Student();
        try {
            student2 = (Student) student.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student.getAge()+"-"+student2.getAge());
        System.out.println(student.getName()+"-"+student2.getName());
        //判断String是否引用同一个对象
        System.out.println(student.getName()==student2.getName());
        student.setAge(12);
        student.setName("王2");
        System.out.println(student.getAge()+"-"+student2.getAge());
        System.out.println(student.getName()+"-"+student2.getName());

    }
}
