package learning.IOStream.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStream_ {
    public static void main(String[] args) {
        FileOutputStream_ test = new FileOutputStream_();
        test.writeFile();
    }

    public void writeFile() {
        String filePath = "D:\\code\\javaProject\\javaPractice\\src\\learning\\IOStream\\OutputStream\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {
//            fileOutputStream = new FileOutputStream(filePath);//新写入的内容会覆盖原内容
            fileOutputStream = new FileOutputStream(filePath,true);//新写入的内容会追加到原内容之后

            //写入一个字节
//            fileOutputStream.write('h');
            //写入字符串
            String str = "hello,world";
//            fileOutputStream.write(str.getBytes());//把字符串转换为字符数组
            //write(byte[] b,int off,int len) 将len字节从偏移量off的指定字节数组写入文件输出流
            fileOutputStream.write(str.getBytes(),0,str.length());
            System.out.println("成功写入");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
