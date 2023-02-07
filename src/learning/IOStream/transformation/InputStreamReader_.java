package learning.IOStream.transformation;

import java.io.*;

public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        //使用InputStreamReader解决中文乱码问题
        String filePath = "D:\\javaPractice\\src\\learning\\IOStream\\transformation\\a.txt";
        //将FileInputStream转成InputStreamReader,可以指定编码方式
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"gbk");
        //将InputStreamReader传给BufferedReader
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();
        System.out.println(str);
        br.close();
    }
}
