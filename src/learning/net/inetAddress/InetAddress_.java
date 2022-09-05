package learning.net.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_ {
    public static void main(String[] args) throws UnknownHostException {
        //1.获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//主机名+IP地址

        //2.根据指定主机名获取InetAddress对象
        InetAddress host1 = InetAddress.getByName("LAPTOP-E75EDF1B");
        System.out.println("host1="+host1);

        //3.根据域名获取InetAddress对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2="+host2);

        //4.通过InetAddress对象，获取对应的地址
        String hostAddress = host2.getHostAddress();
        System.out.println(hostAddress);

        //5.通过InetAddress对象，获取对应的主机名/域名
        String hostName = host2.getHostName();
        System.out.println(hostName);
    }
}
