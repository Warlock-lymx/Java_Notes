package learning.IOStream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {
        FileInputStream_ test = new FileInputStream_();
        //test.readFile1();
        test.readFile2();
    }

    //单个字节读取
    public void readFile1() {
        String filePath = "D:\\code\\javaProject\\javaPractice\\src\\learning\\IOStream\\InputStream\\hello.txt";
        FileInputStream fileInputStream = null;
        int readData = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            //如果返回-1，表示读取完毕
            while((readData = fileInputStream.read())!= -1){
                System.out.print((char)readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //字节数组读取
    public void readFile2() {
        String filePath = "D:\\code\\javaProject\\javaPractice\\src\\learning\\IOStream\\InputStream\\hello.txt";
        FileInputStream fileInputStream = null;
        byte[] buf = new byte[8];
        int readLen = 0;

        try {
            fileInputStream = new FileInputStream(filePath);
            //返回实际读取的字节数，如果返回-1，表示读取完毕
            while((readLen = fileInputStream.read(buf))!= -1){
                System.out.print(new String(buf,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
