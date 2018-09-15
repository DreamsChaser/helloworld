package cn.com.git.leon.javaCore.ComparableAndComparator;

/**
 * @author sirius
 * @since 2018/9/15
 */
public class SortBean implements Comparable<SortBean>{

    private int intValue;

    private String id;

    private String name;

    @Override
    public int compareTo(SortBean o) {
        return this.intValue - o.intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SortBean(int intValue, String id, String name) {
        this.intValue = intValue;
        this.id = id;
        this.name = name;
    }
}
