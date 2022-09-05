package learning.file;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        FileCreate fileCreate = new FileCreate();
        fileCreate.create1();
        fileCreate.create2();
        fileCreate.create3();
    }

    //方式1 new File(String pathname)
    public void create1() {
        String filepath = "D:\\code\\javaProject\\javaPractice\\src\\learning\\file\\news1.txt";
        File file = new File(filepath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式2 new File(File parent,String child) 根据父目录文件+子路径创建
    public void create2() {
        File parentFile = new File("D:\\code\\javaProject\\javaPractice\\src\\learning\\file\\");
        String fileName = "news2.txt";
        File file = new File(parentFile,fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式3 new File(String parent,String child) 根据父目录+子路径创建
    public void create3() {
        String parentPath = "D:\\code\\javaProject\\javaPractice\\src\\learning\\file\\";
        String fileName = "news3.txt";
        File file = new File(parentPath,fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
