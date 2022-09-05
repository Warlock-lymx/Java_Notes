package learning.OOP_advance.poly.dynamic;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.i);//10
        System.out.println(a.sum());//30
        System.out.println(a.sum1());//20
    }
}
//  1.当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
//  2.当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用

class A {
    public int i = 10;
    //动态绑定机制
    public int get() {
        return i;
    }

    public int sum() {
        return get() + 10;
    }

    public int sum1() {
        return i + 10;
    }
}

class B extends A{
    public int i = 20;

    public int get() {
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}