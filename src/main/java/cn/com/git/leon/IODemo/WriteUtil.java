package cn.com.git.leon.IODemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author sirius
 */
public class WriteUtil {

    public static void main(String[] args) {
        File file = new File("D:\\newFile.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("hello");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
