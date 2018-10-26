package cn.com.git.leon.jdk8.lambdaDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * (parameters) -> expression
 或
 (parameters) ->{ statements; }
 * @author sirius
 * @since 2018/9/11
 */
public class LambdaDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.forEach((str)-> System.out.println(str));
    }
}
