package learning.IOStream.transformation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CodeProblem {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        String filePath = "D:\\javaPractice\\src\\learning\\IOStream\\transformation\\a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        //默认情况下，按照utf-8编码读取
        String str = br.readLine();
        System.out.println(str);
        br.close();
    }
}
