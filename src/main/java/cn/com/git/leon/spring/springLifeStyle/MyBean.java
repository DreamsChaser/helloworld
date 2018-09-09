package cn.com.git.leon.spring.springLifeStyle;

import cn.com.git.leon.spring.aopDemo.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author sirius
 * @since 2018/8/28
 */
@Component("myBean")
public class MyBean implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,DisposableBean,InitializingBean,BeanPostProcessor {

    @Autowired
    Student student;
    private static MyBean myBean;


    static {
        System.out.println("静态代码块");
    }

    public MyBean() {
        System.out.println("构造");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName: " + name);
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("销毁");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("preDestroy");
    }

    @PostConstruct
    public void initPostConstruct(){
        myBean = this;
        myBean.student = this.student;
        System.out.println("执行PostConstruct注解标注的方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("属性设置好了");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("initBefore "+beanName);
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("initAfter "+beanName);
        return null;
    }

    public static void testStaticUseAutowiredValue(){
        System.out.println("testStaticUseAutowiredValue");
        System.out.println(myBean.student);
        myBean.student.say();
        System.out.println("testStaticUseAutowiredValue");
    }

    public void testMethod(){
        System.out.println("普通方法");
    }
}
