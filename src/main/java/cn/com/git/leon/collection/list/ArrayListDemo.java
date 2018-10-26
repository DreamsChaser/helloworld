package cn.com.git.leon.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author sirius
 * @since 2018/10/16
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("dd");
        arrayList.add("ee");
        arrayList.add("b");
        System.out.println(Arrays.toString(arrayList.toArray()));
//        for (int i = 0; i < arrayList.size(); i++) {
//            String s = arrayList.get(i);
//            if (s.equals("b")) {
//                arrayList.remove(s);
//            }
//        }

        /** 迭代器中调用arrayList的remove将会导致ConcurrentModificationException及fast-invoke
        for (String s : arrayList){
            if (s.equals("b")){
                arrayList.remove(s);
            }
        }
         **/
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("b")){
                iterator.remove();
            }
        }
        System.out.println(Arrays.toString(arrayList.toArray()));

    }
}
