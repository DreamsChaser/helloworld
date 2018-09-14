package cn.com.git.leon.javaCore.serializableDemo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author sirius
 * @since 2018/9/12
 */
public class Book implements Serializable{

    private static final Long serialVersionUID = 1L;

    private String name;

    private double price;

    private transient String transientField;

    private static String staticField;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransientField() {
        return transientField;
    }

    public void setTransientField(String transientField) {
        this.transientField = transientField;
    }

    public static String getStaticField() {
        return staticField;
    }

    public static void setStaticField(String staticField) {
        Book.staticField = staticField;
    }

    public Book(String name, double price, String transientField,String staticField) {
        this.name = name;
        this.price = price;
        this.transientField = transientField;
        this.staticField = staticField;
    }

    public Book() {
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        System.out.println("手动序列化");
        out.defaultWriteObject();
        out.writeInt(transientField.length());
        for (int i = 0;i<transientField.length();i++){
            out.writeChar(transientField.charAt(i));
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        System.out.println("手动反序列化");
        in.defaultReadObject();
        int length = in.readInt();
        char[] chars = new char[length];
        for (int i = 0;i<length;i++){
            chars[i] = in.readChar();
        }
        transientField = new String(chars,0,length);
    }

}
