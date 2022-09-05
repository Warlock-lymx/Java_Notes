package learning.file;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        FileInfo fileInfo = new FileInfo();
        fileInfo.info();
    }

    //获取文件信息
    public void info() {
        File file = new File("D:\\code\\javaProject\\javaPractice\\src\\learning\\file\\news1.txt");

        //获取文件名
        System.out.println(file.getName());

        //获取绝对路径
        System.out.println(file.getAbsolutePath());

        //获取文件父目录
        System.out.println(file.getParent());

        //获取文件大小(字节)
        System.out.println(file.length());

        //判断文件是否存在
        System.out.println(file.exists());

        //判断是否是一个文件
        System.out.println(file.isFile());

        //判断是否是一个目录
        System.out.println(file.isDirectory());

    }
}
