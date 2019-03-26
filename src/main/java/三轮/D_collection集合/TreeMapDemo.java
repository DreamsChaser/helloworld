package 三轮.D_collection集合;

import java.util.TreeMap;

/**
 * @author sirius
 * @since 2019/3/26
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("天","天");
        treeMap.put("地","地");
        treeMap.put("雨","雨");
        for (Object object : treeMap.keySet()){
            System.out.println(object);
        }
    }
}
