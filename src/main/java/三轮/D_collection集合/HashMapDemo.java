package 三轮.D_collection集合;

import java.util.HashMap;

/**
 * @author sirius
 * @since 2019/3/18
 */
public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        hashMap.put("1",null);
        hashMap.put("1",1);
        hashMap.put(null,1);
        hashMap.put(null,2);
        System.out.println(hashMap);

    }
}
