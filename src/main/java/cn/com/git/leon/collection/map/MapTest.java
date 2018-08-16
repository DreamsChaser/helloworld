package cn.com.git.leon.collection.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wd
 * @version 1.0
 */
public class MapTest {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap<String,String>();
        hashMap.put("2",null);
        hashMap.put("0",null);
        hashMap.put("1",null);
        System.out.println("hashMap" + hashMap);
        TreeMap treeMap = new TreeMap<String,String>();
        treeMap.put("2",null);
        treeMap.put("0",null);
        treeMap.put("1",null);
        System.out.println("treeMap"+treeMap);
        Hashtable hashtable = new Hashtable<String,String>();
        hashtable.put("2",2);
        hashtable.put("0",0);
        hashtable.put("1",1);
        System.out.println("hashtable"+hashtable);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("2",null);
        linkedHashMap.put("0",0);
        linkedHashMap.put("1",1);
        System.out.println("linkedHashMap"+linkedHashMap);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("2",2);
        concurrentHashMap.put("0",0);
        concurrentHashMap.put("1",1);
        System.out.println("concurrentHashMap"+concurrentHashMap);
    }
}
