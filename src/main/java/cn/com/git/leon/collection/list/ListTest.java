package cn.com.git.leon.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Created by shinco on 2018/8/16.
 */
public class ListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(13);
        linkedList.add(4);
        linkedList.add(7);
        linkedList.add(2);
        Vector vector = new Vector();
        vector.add(19);
        vector.add(8);
        vector.add(98);
        vector.add(76);
        vector.add(1);
        System.out.println(linkedList);
        System.out.println(vector);
    }
}
