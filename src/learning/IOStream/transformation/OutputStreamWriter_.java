package learning.IOStream.transformation;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\javaPractice\\src\\learning\\IOStream\\transformation\\b.txt";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), StandardCharsets.UTF_8);
        osw.write("hello梁益铭");
        osw.close();
    }
}
