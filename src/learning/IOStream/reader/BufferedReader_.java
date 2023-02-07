package learning.IOStream.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_ {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\javaPractice\\src\\learning\\IOStream\\reader\\test.txt";
        //创建bufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //1.按行读取
        //2.当返回null时，表示文件读取完毕
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        //关闭流，只需关闭处理流bufferedReader，底层会自动关闭节点流
        bufferedReader.close();
    }
}
