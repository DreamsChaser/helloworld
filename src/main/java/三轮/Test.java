package 三轮;

import org.springframework.util.StringUtils;

/**
 * @author sirius
 * @since 2019/2/21
 */
public class Test {

    public static void main(String[] args) {

        Bean3 bean3 = null;
        if (bean3 == null || StringUtils.isEmpty(bean3.getId())){
            System.out.println(true);
        }
    }
}
