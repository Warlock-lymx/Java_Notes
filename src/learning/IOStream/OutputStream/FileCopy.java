package learning.IOStream.OutputStream;

import java.io.*;

public class FileCopy {
    public static void main (String args[]) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream =null;
        String srcPath = "D:\\code\\javaProject\\javaPractice\\src\\learning\\IOStream\\InputStream\\hello.txt";
        String destPath = "D:\\code\\javaProject\\javaPractice\\src\\learning\\IOStream\\OutputStream\\copy.txt";
        try {
            fileInputStream = new FileInputStream(srcPath);
            fileOutputStream = new FileOutputStream(destPath);
            byte[] buf = new byte[1024];
            int readlen = 0;
            while((readlen = fileInputStream.read(buf))!=-1) {
                fileOutputStream.write(buf,0,readlen);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fileInputStream != null) {
                    fileInputStream.close();
                }
                if(fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
