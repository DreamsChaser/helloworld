package cn.com.git.leon.collection.map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author sirius
 * @since 2018/8/27
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,"测试位置");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    }
}