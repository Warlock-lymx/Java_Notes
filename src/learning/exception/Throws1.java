package learning.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws1 {
    public static void main(String[] args) throws Exception{
        //f1抛出的是一个编译异常，必须处理,如果是运行异常则不是必须解决，有默认处理机制
        f1();
    }

    public static void f1() throws FileNotFoundException,NullPointerException,ArithmeticException {
        //使用Throw，抛出异常，让调用f1方法的调用者处理
        //throws后面可以是方法中产生的异常，也可以时它的父类
        //throws关键字后也可以时一场列表，即可以抛出多个异常
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }

    public void f2() {

    }
}

class Father {
    public void method() throws RuntimeException {
    }
}

//子类重写父类的方法时，所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出的异常类型的子类型
class Son extends Father {
    public void method() throws NullPointerException {
    }
}