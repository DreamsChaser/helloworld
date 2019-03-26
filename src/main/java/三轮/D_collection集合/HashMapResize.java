package 三轮.D_collection集合;

/**
 * @author sirius
 * @since 2019/3/26
 */
public class HashMapResize<K,V> {

    HashMapNode[] table;

    public void transfer(HashMapNode[] newTable) {

        HashMapNode[] src = table;
        int newCapacity = newTable.length;
        //下面这段代码的意思是：
        //  从OldTable里摘一个元素出来，然后放到NewTable中
        for (int j = 0; j < src.length; j++) {
            HashMapNode<K,V> e = src[j];
            if (e != null) {
                src[j] = null;
                do {
                    HashMapNode<K,V> next = e;
                    int i = e.hash& (newCapacity-1);
                    e.next = newTable[i];
                    newTable[i] = e;
                    e = next;
                } while (e != null);
            }
        }
    }
}
