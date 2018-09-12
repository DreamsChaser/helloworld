package cn.com.git.leon.javaCore.serializableDemo;

import java.io.Serializable;

/**
 * @author sirius
 * @since 2018/9/12
 */
public class Book implements Serializable{

    private static final Long serialVersionUID = 1L;

    private String name;

    private double price;

    private transient String field;

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

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Book(String name, double price, String field) {
        this.name = name;
        this.price = price;
        this.field = field;
    }

    public Book() {
    }
}
