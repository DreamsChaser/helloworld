package cn.com.git.leon.spring.springLifeStyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author sirius
 * @since 2018/9/4
 */
@Component("StaticMethodUserAutowiredValue")
public class StaticMethodUserAutowiredValue {

    @Autowired
    MyBean myBean;

    private static StaticMethodUserAutowiredValue staticMethodUserAutowiredValue;

    @PostConstruct
    public void init(){
        staticMethodUserAutowiredValue = this;
        staticMethodUserAutowiredValue.myBean = this.myBean;
    }

    public static void testStaticMethodUserAutowiredValue(){
        staticMethodUserAutowiredValue.myBean.testMethod();
    }
}
