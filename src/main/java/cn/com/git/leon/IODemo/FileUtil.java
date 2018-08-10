package cn.com.git.leon.IODemo;

import java.io.File;

/**
 * @author sirius
 */
public class FileUtil {

    public static void newFile(String url) throws Exception{
        File file = new File(url);
        if (file.exists()){
            throw new Exception("文件已存在");
        }
        file.createNewFile();
    }

    public static void newDir(String url) throws Exception{
        File file = new File(url);
        if (file.isDirectory()){
            throw new Exception("目录已存在");
        }
        file.mkdir();
    }

    public static void newDirs(String url) throws Exception{
        File file = new File(url);
        if (file.isDirectory()){
            throw new Exception("目录已存在");
        }
        file.mkdirs();
    }
}
