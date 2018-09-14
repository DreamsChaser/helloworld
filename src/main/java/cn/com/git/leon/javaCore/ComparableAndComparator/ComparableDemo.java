package cn.com.git.leon.javaCore.ComparableAndComparator;

/**
 * @author sirius
 * @since 2018/9/14
 */
public class ComparableDemo implements Comparable<ComparableDemo>{

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(ComparableDemo comparableDemo) {
        return this.id-comparableDemo.id;
    }

    public ComparableDemo(int id) {
        this.id = id;
    }
}
