package cn.com.git.leon.jvm.outOfMemory;

import java.util.LinkedList;

/**
 * @author sirius
 * @since 2018/9/10
 */
public class OutOfMemoryDemo {

    static class OOMObject{}

    public static void main(String[] args) {
        LinkedList<OOMObject> linkedList = new LinkedList();
        while (true){
            linkedList.add(new OOMObject());
        }
    }
}
