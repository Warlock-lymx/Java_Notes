package learning.IOStream.InputStream;


import learning.IOStream.OutputStream.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //指定要反序列化的文件
        String filePath = "D:\\javaPractice\\src\\learning\\IOStream\\OutputStream\\data.dat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //反序列化(读取)顺序需要和序列化(存储)顺序一致
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println(dog.getClass());

        //序列化对象时，不会序列化static和transient修饰的属性
        //序列化对象时，要求里面属性的类型也实现了序列化接口
        //序列化具备可继承性，父类实现序列化，子类默认也实现了序列化
        System.out.println(dog);
        ois.close();

        //如果要调用dog的方法，需要向下转型
        Dog dog2 = (Dog)dog;
        System.out.println(dog2.getName());
    }
}
