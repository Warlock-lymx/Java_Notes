package learning.OOP_advance.innerClass;

public class InnerClass {
    public static void main(String[] args) {

    }
}
/**
内部类分类：
定义在外部类局部位置上（如方法内）：
    1.局部内部类（有类名）
    2.匿名内部类（没有类名）
定义在外部类的成员位置上：
    1.成员内部类（没用static修饰）
    2.静态内部类（使用static修饰）
 **/


class Outer {//外部类
    private int n1 = 100;

    public Outer(int n1) {
        this.n1 = n1;
    }

    public void m1() {
        System.out.println("m1");
    }

    {
        System.out.println("代码块");
    }

    class Inner {//内部类

    }
}