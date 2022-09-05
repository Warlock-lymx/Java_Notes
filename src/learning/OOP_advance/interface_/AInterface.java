package learning.OOP_advance.interface_;

public interface AInterface {
    //接口中所有的属性都是public static final的
    public int n1 = 10;//等价于public static final int n1 = 10;

    public void hi();

    //jdk8后，可以有默认实现方法，需要使用default关键字修饰
    default public void ok() {
        System.out.println("ok");
    }

    //jdk8后，可以有静态方法
    public static void cry() {
        System.out.println("cry");
    }
}