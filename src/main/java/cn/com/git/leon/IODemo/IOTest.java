package cn.com.git.leon.IODemo;

/**
 * @author sirius
 */
public class IOTest {
    public static void main(String[] args) {
        try {
            FileUtil.newFile("D:\\newFile.txt");
//            FileUtil.newDir("D:\\dir");
//            FileUtil.newDirs("D:\\qq\\ww\\ee");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
