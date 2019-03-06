package 三轮.B_JavaCore.b_keyworld;

import java.io.*;

/**
 * @author sirius
 * @since 2019/3/6
 */
public class TransientDemo2 {

    public static void main(String[] args) {
        TransientBean2 bean = new TransientBean2();
        bean.setId("1");
        bean.setPassword("123456");
        File file = new File("D:\\workspace\\externalizableText");
//        if (file.exists()){
//            file.delete();
//        }
        try {
            //序列化
//            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
//            out.writeObject(bean);
//            反序列化
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            try {
                Object object = in.readObject();
                TransientBean2 transientBean = (TransientBean2) object;
                System.out.println(transientBean.getId()+transientBean.getPassword());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
