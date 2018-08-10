package cn.com.git.leon;

import java.util.*;

/**
 * @author wd
 * @version 1.0
 */
public class Test{

    public static void main(String[] args) {
        HashMap hashMap = new HashMap<String,String>();
        hashMap.put("2",null);
        hashMap.put("0",null);
        hashMap.put("1",null);
        System.out.println(hashMap);
        TreeMap treeMap = new TreeMap<String,String>();
        treeMap.put("2",null);
        treeMap.put("0",null);
        treeMap.put("1",null);
        System.out.println(treeMap);
        Hashtable hashtable = new Hashtable<String,String>();
        hashtable.put("2",2);
        hashtable.put("0",0);
        hashtable.put("1",1);
        System.out.println(hashtable);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("2",null);
        linkedHashMap.put("0",null);
        linkedHashMap.put("1",null);
        System.out.println(linkedHashMap);
    }
}
