package cn.com.git.leon.copy;

/**
 * Created by wangDi on 2018/8/12.
 */
public class Test {
    public static void main(String[] args) {
        Man man = new Man();
        Name name = new Name();
        name.setFirstName("bruce");
        name.setLastName("sirius");
        Address address = new Address();
        address.setCity("南京");
        address.setStreet("建邺区");
        man.setAddress(address);
        man.setName(name);
        System.out.println(man);

        Man woman = new Man(man);
        woman.getName().setFirstName("王");
        System.out.println(man);
    }
}
