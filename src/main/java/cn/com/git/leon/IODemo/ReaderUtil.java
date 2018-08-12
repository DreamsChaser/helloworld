package cn.com.git.leon.IODemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * @author sirus
 */
public class ReaderUtil {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\newFile.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream,"GBK"));
            String name = bufferedReader.readLine();
            String age = bufferedReader.readLine();
            System.out.println("name:"+name+"age:"+age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
