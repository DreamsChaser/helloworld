package cn.codeRefactoring.reflectRelaceIfelse;

/**
 * 下单接口，对每个类型的下单可能有不同的下单规则
 * @author sirius
 * @since 2018/8/29
 */
public interface IOrder {

    void doOrder(String type);
}
