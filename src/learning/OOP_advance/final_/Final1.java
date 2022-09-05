package learning.OOP_advance.final_;

public class Final1 {
    public static void main(String[] args) {

    }
}

//1.final A类无法被其他类继承
//2.final hi()方法无法被重写
//3.final 属性n无法被修改
//4.一般来说，如果一个类已经是final类，就没必要再将方法修饰成final方法

//  赋值：1.在定义时 2.在构造器中 3.在代码块中
final class A {
    private final double TAX_RATE1 = 9;
    private final double TAX_RATE2;
    private final double TAX_RATE3;

    {
        TAX_RATE2 = 10;
    }

    public A() {
        TAX_RATE3 = 1;
    }
    public final void hi() {}
}

class B {
    //静态属性只能在定义时或静态代码块中赋值，不能在构造器中，因为再类加载时属性就需要赋值。
    private static final double TAX_RATE1 = 99;
    private static final double TAX_RATE2;

    static {
        TAX_RATE2 = 100;
    }
}