package cn.com.git.leon.IODemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author sirius
 */
public class IOUtil {
    public static void main(String[] args) {
        File file = new File("D:\\newFile.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str = "exception";
            fileOutputStream.write(str.getBytes());
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
