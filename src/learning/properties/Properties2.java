package learning.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Properties2 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //加载指定配置文件
        properties.load(new FileReader("D:\\javaPractice\\src\\learning\\properties\\mysql.properties"));
        //显示键值对到控制台
        properties.list(System.out);
        //根据key获取相应的值
        String user = properties.getProperty("user");
        System.out.println(user);
        //创建修改配置文件
        properties.setProperty("charset","utf-8");
        //如果没有指定key就是创建，有就是修改
        properties.setProperty("pwd","888888");
        properties.store(new FileWriter("D:\\javaPractice\\src\\learning\\properties\\mysql.properties"),null);
    }
}
