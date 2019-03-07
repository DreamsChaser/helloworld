package 三轮.B_JavaCore.b_keyworld;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author sirius
 * @since 2019/3/4
 */
public class TransientBean implements Serializable{

    private static final long serialVersionUID = 1L;

    private String Id;

    private String name;

    private transient String password;

    private static String staticField;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        System.out.println("手动序列化");
        out.defaultWriteObject();
        out.writeObject(password.toUpperCase());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("手动反序列化");
        in.defaultReadObject();
        password = (String) in.readObject();
    }

    public static String getStaticField() {
        return staticField;
    }

    public static void setStaticField(String staticField) {
        TransientBean.staticField = staticField;
    }
}
