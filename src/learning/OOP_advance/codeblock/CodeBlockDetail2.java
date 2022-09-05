package learning.OOP_advance.codeblock;

public class CodeBlockDetail2 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
    }
}

class AAA {
    {
        System.out.println("AAA 普通代码块被执行");//3
    }

    static {
        System.out.println("AAA 静态代码块被执行");//1
    }

    public AAA() {
        System.out.println("AAA 构造器被执行");//4
    }
}

class BBB extends AAA {
    {
        System.out.println("BBB 普通代码块被执行");//5
    }

    static {
        System.out.println("BBB 静态代码块被执行");//2
    }

    public BBB() {
        System.out.println("BBB 构造器被执行");//6
    }
}
