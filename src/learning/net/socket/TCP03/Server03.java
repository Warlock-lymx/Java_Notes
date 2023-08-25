package learning.net.socket.TCP03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server03 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();

        //接收客户端发来的数据
        InputStream inputStream = socket.getInputStream();
        BufferedInputStream socketInputStream = new BufferedInputStream(inputStream);
        byte[] bytes = StreamUtils.streamToByteArray(socketInputStream);

        //将客户端发来的图片保存到相应地址
        String destPath = "D:\\javaPractice\\src\\learning\\net\\socket\\TCP03\\src\\copy.jpg";
        BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(destPath));
        fileOutputStream.write(bytes);

//        byte[] buff = new byte[1024];
//        int readLen = 0;
//        while ((readLen = socketInputStream.read()) != -1) {
//            fileOutputStream.write(buff, 0, readLen);
//        }

        fileOutputStream.close();

        //向客户端回复“收到图片”
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        socketWriter.write("收到图片" + "\r\n" + "收到请回复");
        socketWriter.newLine();
        socketWriter.flush() ;

        socketInputStream.close();
        socketWriter.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");
    }
}
