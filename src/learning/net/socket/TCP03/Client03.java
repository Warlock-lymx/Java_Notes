package learning.net.socket.TCP03;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client03 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        //读入一张图片
        String filePath = "D:\\javaPractice\\src\\learning\\IOStream\\OutputStream\\c.jpg";
        BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(filePath));
        byte[] bytes = StreamUtils.streamToByteArray(fileInputStream);

        //将图片发送到服务端
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream socketOutputStream = new BufferedOutputStream(outputStream);
        socketOutputStream.write(bytes);

        fileInputStream.close();
        socket.shutdownOutput(); //一次写入结束标记

//        byte[] buff = new byte[1024];
//        int readLen = 0;
//        while ((readLen = fileInputStream.read(buff)) != -1) {
//            socketOutputStream.write(buff, 0, readLen);
//        }
//        fileInputStream.close();
//        socketOutputStream.flush();
//        socket.shutdownOutput();

//        InputStream inputStream = socket.getInputStream();
//        BufferedInputStream socketInputStream = new BufferedInputStream(inputStream);
//
//        byte[] buff2 = new byte[1024];
//        int readLen2 = 0;
//        while ((readLen2 = socketInputStream.read(buff2)) != -1) {
//            System.out.println(new String(buff2, 0, readLen2));
//        }

        InputStream inputStream = socket.getInputStream();
        BufferedReader socketReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while((line = socketReader.readLine())!=null) {
            stringBuffer.append(line + "\r\n");
        }
        System.out.println(stringBuffer);

        socketReader.close();
        socketOutputStream.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
