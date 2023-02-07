package learning.IOStream.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriter_ {

    public static void main(String[] args) throws Exception {
        String filePath = "D:\\javaPractice\\src\\learning\\IOStream\\writer\\test2.txt";
        //创建BufferedWriter
        //new FileWriter(filePath,true) 表示以追加的方式写入，不带true选项则以覆盖的方式写入
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("hello world1");
        bufferedWriter.newLine();   //插入换行符
        bufferedWriter.write("hello world2");
        bufferedWriter.newLine();
        bufferedWriter.write("hello world3");
        bufferedWriter.newLine();
        //关闭外层处理流
        bufferedWriter.close();
    }
}
