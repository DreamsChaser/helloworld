package 三轮.B_JavaCore.b_keyworld;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @author sirius
 * @since 2019/3/6
 */
public class TransientBean2 implements Externalizable {

    private static final long serialVersionUID = -7348496215395099219L;

    private String id;

    private transient String password;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
