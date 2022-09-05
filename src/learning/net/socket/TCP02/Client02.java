package learning.net.socket.TCP02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client02 {
    public static void main(String[] args) throws IOException {
        //1.连接服务端(ip,端口)
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回 =" + socket.getClass());

        //2.连接成功后，生成Socket对象，得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流，写入数据到数据通道，使用字符流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server");
        bufferedWriter.newLine();//插入一个换行符，表示写入的内容结束，要求对方使用readLine()
        bufferedWriter.flush();//字符流必须手动刷新

        //4.获取和socket相关联的输入流，读取数据，使用字符流
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        //5.关闭流对象和socket
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出...");
    }
}
