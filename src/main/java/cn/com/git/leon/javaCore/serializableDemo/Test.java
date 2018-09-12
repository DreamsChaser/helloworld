package cn.com.git.leon.javaCore.serializableDemo;

import com.alibaba.fastjson.JSON;

import java.io.*;

/**
 * @author sirius
 * @since 2018/9/12
 */
public class Test {

    public static void main(String[] args) {
        try {
            Book book = new Book("红楼梦", 100, "transient字段");
            File file = new File("d:\\serializable.txt");
            System.out.println(JSON.toJSONString(book));
            System.out.println(book.getField());
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//            objectOutputStream.writeObject(book);

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Book book1 = (Book) objectInputStream.readObject();
            System.out.println(JSON.toJSONString(book1));
            System.out.println(book1.getField());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
