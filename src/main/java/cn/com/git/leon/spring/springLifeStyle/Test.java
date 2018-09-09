package cn.com.git.leon.spring.springLifeStyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sirius
 * @since 2018/8/28
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("读取xml文件");
        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        System.out.println(myBean);
        myBean.testStaticUseAutowiredValue();
        ((ClassPathXmlApplicationContext)applicationContext).registerShutdownHook();

    }
}
