package learning.IOStream.writer;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {
        //1.BufferedReader 和 BufferedWriter是按照字符操作的，不能操作二进制文件(视频、音频、word等)。

        String srcFilePath = "D:\\javaPractice\\src\\learning\\IOStream\\writer\\test2.txt";
        String destFilePath = "D:\\javaPractice\\src\\learning\\IOStream\\writer\\test3.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String line;
        try {
            bufferedReader = new BufferedReader(new FileReader(srcFilePath));
            bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));

            //readLine时读取一行的内容，不包括换行符
            while ((line = bufferedReader.readLine())!=null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedReader!=null) {
                    bufferedReader.close();
                }
                if(bufferedWriter!=null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
