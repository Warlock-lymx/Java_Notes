package learning.net.socket.TCP02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
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

        //4.IO读取,使用字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        //5.获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        //使用字符流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client");
        bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束，要求对方使用readLine()
        bufferedWriter.flush();//字符流必须手动刷新

        //6.关闭流和socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出...");
    }
}