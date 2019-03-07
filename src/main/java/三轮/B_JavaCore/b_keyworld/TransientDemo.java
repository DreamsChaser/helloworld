package 三轮.B_JavaCore.b_keyworld;

import com.alibaba.fastjson.JSON;

import java.io.*;

/**
 * @author sirius
 * @since 2019/3/4
 */
public class TransientDemo {

    public static void main(String[] args) {
        TransientBean bean = new TransientBean();
        bean.setId("1");
        bean.setName("tom");
        bean.setPassword("abc");
        TransientBean.setStaticField("test1");
        File file = new File("D:\\workspace\\serializableText");
        if (file.exists()){
            file.delete();
        }
        try {
            //序列化
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(bean);
            //反序列化
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            try {
                Object object = in.readObject();
                TransientBean transientBean = (TransientBean) object;
                System.out.println(transientBean.getId()+transientBean.getName()+transientBean.getPassword());
                System.out.println(TransientBean.getStaticField());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
