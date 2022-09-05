package learning.net.socket.TCP01;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) throws IOException {
        //1.在本机的9999端口监听，等待连接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端程序在9999端口监听，等待连接");

        //2.当没有客户端连接9999端口时，程序会阻塞，等待连接
        //  当有客户端连接，则会返回Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务端socket =" + socket.getClass());

        //3.获取与socket相关联的输入流，读取客户端写入数据通道中的数据
        InputStream inputStream = socket.getInputStream();

        //4.IO读取
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));
        }

        //5.获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        //设置结束标记
        socket.shutdownOutput();

        //6.关闭流和socket
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出...");
    }
}
