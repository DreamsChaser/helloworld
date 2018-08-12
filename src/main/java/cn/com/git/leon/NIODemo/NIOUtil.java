package cn.com.git.leon.NIODemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author sirius
 */
public class NIOUtil {
    public static void main(String[] args) {
        try {
            String str = "反转此缓冲区";
            byte[] bytes = str.getBytes();
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\newFile.txt");
            FileChannel fileChannel = fileOutputStream.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(48);
            byteBuffer.put(bytes);
            byteBuffer.flip();
            fileChannel.write(byteBuffer);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
