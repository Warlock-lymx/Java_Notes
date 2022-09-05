package learning.IOStream.writer;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        FileWriter_ writer = new FileWriter_();
        writer.writeFile();
    }

    public void writeFile() {
        String filePath = "D:\\code\\javaProject\\javaPractice\\src\\learning\\IOStream\\writer\\test.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a','b','c'};
        try {
            fileWriter = new FileWriter(filePath);
            //1.写入单个字符
//            fileWriter.write('H');
            //2.写入指定数组
//            fileWriter.write(chars);
            //3.写入指定数组的指定部分
//            fileWriter.write("abcdefg".toCharArray(),0,5);
            //4.写入字符串
//            fileWriter.write("你好世界");
            //5.写入字符串的指定部分
            fileWriter.write("你好世界",0,2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
