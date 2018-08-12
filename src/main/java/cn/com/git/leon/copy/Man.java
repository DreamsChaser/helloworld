package cn.com.git.leon.copy;

/**
 * Created by wangDi on 2018/8/12.
 */
public class Man {

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

    public Man() {
    }

    public Man(Man newMan){
        this.name = newMan.name;
        this.address = newMan.address;
    }

    @Override
    public String toString() {
        return "Man{" +
                "address=" + address +
                ", name=" + name +
                '}';
    }
}
