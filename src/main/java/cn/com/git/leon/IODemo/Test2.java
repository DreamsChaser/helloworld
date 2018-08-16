package cn.com.git.leon.IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Date;

/**
 * Created by shinco on 2018/8/16.
 */
public class Test2 {

    public static void main(String[] args) {
        //测试IO阻塞和NIO非阻塞
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0;i < 10000000;i++){
            stringBuffer.append(i+"阻塞");
        }
        try {
            /**
             * IO阻塞

            System.out.println(new Date());
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\writeFile.txt");
            fileOutputStream.write(stringBuffer.toString().getBytes());
            fileOutputStream.close();
            System.out.println(new Date());
            FileOutputStream fileOutputStream2 = new FileOutputStream("D:\\writeFile2.txt");
            fileOutputStream2.write(stringBuffer.toString().getBytes());
            fileOutputStream2.close();
            System.out.println(new Date());
             */
            /**
             * NIO非阻塞
             */
            System.out.println(new Date());
            FileOutputStream fileOutputStream3 = new FileOutputStream("D:\\writeFile.txt");
            FileChannel fileChannel = fileOutputStream3.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(48);
            byteBuffer.put(stringBuffer.toString().getBytes());
            byteBuffer.flip();
            fileChannel.write(byteBuffer);
            fileOutputStream3.flush();
            fileOutputStream3.close();
            System.out.println(new Date());
            FileOutputStream fileOutputStream4 = new FileOutputStream("D:\\writeFile2.txt");
            FileChannel fileChannel2 = fileOutputStream4.getChannel();
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(48);
            byteBuffer2.put(stringBuffer.toString().getBytes());
            byteBuffer2.flip();
            fileChannel2.write(byteBuffer);
            fileOutputStream4.flush();
            fileOutputStream4.close();
            System.out.println(new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
