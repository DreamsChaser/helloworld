package new_learn_java;



/**
 * @author sirius
 * @since 2018/12/7
 */
public class OutOfMemoryTest {
    public final static int OUT_OF_MEMORY = 200000000;

    private String oom;

    private int length;

    StringBuffer tempOOM = new StringBuffer();

    public OutOfMemoryTest(int length) {
        this.length = length;

        int i = 0;
        while (i < length) {
            i++;
            try {
                tempOOM.append("a");
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                break;
            }
            if (i == 10000){
                System.out.println(10000);
            }
        }
        this.oom = tempOOM.toString();

    }

    public String getOom() {
        return oom;
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args) {
        OutOfMemoryTest javaHeapTest = new OutOfMemoryTest(OUT_OF_MEMORY);
        System.out.println(javaHeapTest.getOom().length());
    }
}
