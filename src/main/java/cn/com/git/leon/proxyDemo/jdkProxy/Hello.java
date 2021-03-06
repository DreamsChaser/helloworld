package cn.com.git.leon.proxyDemo.jdkProxy;

/**
 * Created by wangDi on 2018/8/22.
 */
public class Hello implements IHello{

    private String name;

    public final void sayHello() {
        System.out.println("你好"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hello(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hello hello = (Hello) o;

        return name != null ? name.equals(hello.name) : hello.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
