package cn.codeRefactoring.toMuchIfElse;

/**
 * @author sirius
 * @since 2018/8/30
 */
public class QuanProductDTO {

    private String productId;
    private String name;
    //01积分券 02level2券 03理财券
    private String type;

    /**
     * 积分券字段
     */
    private Long points;
    /**
     * level2券字段
     */
    private String level2Unit;
    private Long level2Val;
    /**
     * 理财券字段
     */
    private String lcQd;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public String getLevel2Unit() {
        return level2Unit;
    }

    public void setLevel2Unit(String level2Unit) {
        this.level2Unit = level2Unit;
    }

    public Long getLevel2Val() {
        return level2Val;
    }

    public void setLevel2Val(Long level2Val) {
        this.level2Val = level2Val;
    }

    public String getLcQd() {
        return lcQd;
    }

    public void setLcQd(String lcQd) {
        this.lcQd = lcQd;
    }
}
