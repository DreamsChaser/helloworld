package cn.com.git.leon.javaCore.cloneDemo;

/**
 * @author sirius
 * @since 2018/9/15
 */
public class Test {
    public static void main(String[] args) {
        Man man = new Man();
        Address address = new Address();
        address.setCity("南京");
        address.setStreet("建业");
        Name name = new Name();
        name.setFirstName("王");
        name.setLastName("迪");
        man.setAddress(address);
        man.setName(name);
        man.setAge(10);
        try {
            Man women = (Man) man.clone();
            System.out.println(man);
            System.out.println(women);
            women.setAge(12);
            women.getAddress().setStreet("雨花");
            System.out.println(man);
            System.out.println(women);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
