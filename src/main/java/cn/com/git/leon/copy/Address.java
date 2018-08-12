package cn.com.git.leon.copy;

/**
 * Created by wangDi on 2018/8/12.
 */
public class Address {

    private String city;

    private String Street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", Street='" + Street + '\'' +
                '}';
    }
}
