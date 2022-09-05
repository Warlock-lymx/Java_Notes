package learning.net.socket.TCP01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client01 {
    public static void main(String[] args) throws IOException {
        //1.连接服务端(ip,端口)
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回 =" + socket.getClass());

        //2.连接成功后，生成Socket对象，得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流，写入数据到数据通道
        outputStream.write("hello,server".getBytes());
        //设置结束标记
        socket.shutdownOutput();

        //4.获取和socket相关联的输入流，读取数据
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));
        }

        //5.关闭流对象和socket
        outputStream.close();
        inputStream.close();
        socket.close();
        System.out.println("客户端退出...");
    }
}
