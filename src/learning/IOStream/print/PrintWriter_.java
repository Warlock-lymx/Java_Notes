package learning.IOStream.print;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("hi 我是梁益铭");
        printWriter.close();

        PrintWriter printWriter1 = new PrintWriter(new FileWriter("D:\\javaPractice\\src\\learning\\IOStream\\print\\b.txt"));
        printWriter1.println("hi 我是梁益铭");
        printWriter1.close();

    }
}
