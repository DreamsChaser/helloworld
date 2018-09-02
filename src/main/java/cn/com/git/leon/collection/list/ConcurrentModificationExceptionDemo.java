package cn.com.git.leon.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author sirius
 * @since 2018/8/31
 */
public class ConcurrentModificationExceptionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            if(integer==2)
                list.remove(integer);
        }
    }
}
