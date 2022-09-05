package learning.OOP_advance.codeblock;

public class CodeBlockDetail1 {
    public static void main(String[] args) {
//        AA aa = new AA();
        int n = CC.n;
        DD dd = new DD();
        DD dd1 = new DD();
        //普通代码块在每创建一个对象就执行一次；静态代码块只有在类加载的时候执行
    }
}
//类加载时期：
//1.创建对象实例时
//2.创建子类对象实例，父类也会被加载
//3.使用类的静态成员时

//创建对象时一个类的调用顺序：
//1.调用静态代码块和静态属性初始化
//2.调用普通代码块和普通属性初始化
//3.调用构造函数

class AA {
    static {
        System.out.println("AA 静态代码被执行");
    }
}
class BB extends AA{
    static {
        System.out.println("BB 静态代码被执行");
    }
}

class CC {
    public static int n = 100;
    static {
        System.out.println("CC 静态代码块被执行");
    }
}

class DD {
    static {
        System.out.println("DD 静态代码块被执行");
    }
}