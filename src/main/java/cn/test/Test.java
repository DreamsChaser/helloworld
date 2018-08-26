package cn.test;

/**
 * @author sirius
 */
public class Test {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String str3 = "abcdef";
        String str4 = "abc" + "def";
        System.out.println(str1+str2==str3);
        System.out.println(str3 == str4);
    }
}
