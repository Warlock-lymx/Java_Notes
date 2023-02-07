package learning.IOStream.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\javaPractice\\src\\learning\\IOStream\\OutputStream\\data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到 data.dat
        oos.writeInt(100); //int->Integer(实现了 Serializable接口) 下面也一样，基本数据类型会转化为包装类
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(99.9);
        oos.writeUTF("梁益铭");
        oos.writeObject(new Dog("jack", 12));
        oos.close();
    }
}

