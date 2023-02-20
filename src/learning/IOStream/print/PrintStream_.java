package learning.IOStream.print;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        //默认情况下，PrintStream输出的位置为显示器
        out.print("hello");
        out.write("你好".getBytes());
        out.close();

        //修改PrintStream输出的位置
        System.setOut(new PrintStream("D:\\javaPractice\\src\\learning\\IOStream\\print\\a.txt"));
        System.out.println("hello world");
    }
}
