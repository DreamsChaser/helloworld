package cn.com.git.leon.serializableDemo;

import java.io.*;

/**
 * @author sirius
 * @since 2018/8/27
 */
public class SerializableDemo {
    public static void main(String[] args) {
        SerializableStudent serializableStudent = new SerializableStudent();
        UnSerialStudent unSerialStudent = new UnSerialStudent();
        serializableStudent.setAge(21);
        serializableStudent.setName("sirius");
        unSerialStudent.setAge(22);
        unSerialStudent.setName("ant");
        serializableStudent.say();
        try {
            //保存在本地
            System.out.println("开始保存");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("E:\\serializable.txt")));
            objectOutputStream.writeObject(unSerialStudent);
            objectOutputStream.close();
            Thread.sleep(1000*5);
            //读取对象
            System.out.println("开始读取");
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("E:\\serializable.txt")));
            UnSerialStudent student = (UnSerialStudent) inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
