package cn.com.git.leon.javaCore.cloneDemo;

/**
 * Created by wangDi on 2018/8/12.
 */
public class Man implements Cloneable{

    private int age;

    private Address address;

    private Name name;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Man() {
    }

    public Man(Man newMan){
        this.name = newMan.name;
        this.address = newMan.address;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                ", address=" + address +
                ", name=" + name +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Man man = (Man) super.clone();
        man.address = (Address) address.clone();
        return man;
    }
}
