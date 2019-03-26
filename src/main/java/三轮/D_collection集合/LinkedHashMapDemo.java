package 三轮.D_collection集合;

import java.util.LinkedHashMap;

/**
 * @author sirius
 * @since 2019/3/26
 */
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("天","天");
        linkedHashMap.put("地","地");
        for (Object key : linkedHashMap.keySet()){
            System.out.println(key);
        }
    }

}
