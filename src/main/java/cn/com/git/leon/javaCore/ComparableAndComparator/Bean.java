package cn.com.git.leon.javaCore.ComparableAndComparator;

/**
 * @author sirius
 * @since 2018/9/15
 */
public class Bean {

    private int intValue;

    private String id;

    private String name;

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

    public Bean(int intValue, String id, String name) {
        this.intValue = intValue;
        this.id = id;
        this.name = name;
    }
}
