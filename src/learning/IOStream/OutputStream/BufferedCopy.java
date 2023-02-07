package learning.IOStream.OutputStream;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) {
        String srcFilePath = "D:\\javaPractice\\src\\learning\\IOStream\\OutputStream\\b.jpg";
        String destFilePath = "D:\\javaPractice\\src\\learning\\IOStream\\OutputStream\\c.jpg";

        //创建对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //循环读取文件后写入
            byte[] buff = new byte[1024];
            int readLen = 0;
            while ((readLen = bis.read(buff)) != -1) {
                bos.write(buff, 0, readLen);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
