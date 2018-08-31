package cn.com.git.leon.collection.map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author sirius
 * @since 2018/8/27
 */
public class HashMapDemo {
    public static void main(String[] args) {
        int i = (int) (0.75*2);
        final HashMap  hashMap = new HashMap(2);
        System.out.println(new Integer(5).hashCode());
        hashMap.put(5,"key5");
        hashMap.put(7,"key7");
        hashMap.put(3,"key3");
    }
}
