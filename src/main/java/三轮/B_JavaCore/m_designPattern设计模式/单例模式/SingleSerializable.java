package 三轮.B_JavaCore.m_designPattern设计模式.单例模式;

import java.io.*;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class SingleSerializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingle hungrySingle1 = HungrySingle.getInstance();
        HungrySingle hungrySingle2 = HungrySingle.getInstance();
        System.out.println(hungrySingle1 == hungrySingle2);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SingleSerializable"));
        oos.writeObject(hungrySingle1);
        oos.flush();
        oos.close();
        FileInputStream fis = new FileInputStream("SingleSerializable");
        ObjectInputStream ois = new ObjectInputStream(fis);
        HungrySingle hungrySingle3 = (HungrySingle)ois.readObject();
        System.out.println(hungrySingle1 == hungrySingle3);
        ois.close();

    }
}
