package learning.file;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {
        Directory_ directory = new Directory_();
        directory.deleteFile();
        directory.deleteDirectory();
        directory.isExist();
    }

    //删除文件
    public void deleteFile() {
        String filePath = "D:\\code\\javaProject\\javaPractice\\src\\learning\\file\\news1.txt";
        File file = new File(filePath);
        if(file.exists()) {
            if(file.delete()) {
                System.out.println("删除成功");
            }
            else {
                System.out.println("删除失败");
            }
        }
        else {
            System.out.println("文件不存在");
        }
    }

    //删除目录
    public void deleteDirectory() {
        String directoryPath = "D:\\code\\javaProject\\javaPractice\\src\\learning\\basic";
        File file = new File(directoryPath);
        if(file.exists()) {
            if(file.delete()) {
                System.out.println("删除成功");
            }
            else {
                System.out.println("删除失败");
            }
        }
        else {
            System.out.println("文件不存在");
        }
    }

    //判断目录是否存在，不存在则创建
    public void isExist() {
        String directoryPath = "D:\\code\\javaProject\\javaPractice\\src\\learning\\file\\a\\b\\c";
        File file =  new File(directoryPath);
        if(file.exists()) {
            System.out.println("目录存在");
        }
        else {
            if(file.mkdirs()) {
                System.out.println("创建成功");
            }
            else {
                System.out.println("创建失败");
            }
        }
    }


}
