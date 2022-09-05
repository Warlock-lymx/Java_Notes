package learning.OOP_advance.interface_;

public class Interface1 {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
    }
}
//如果一个类实现一个接口，就需要实现该类中的所有抽象方法
class A implements AInterface {
    @Override
    public void hi() {
        System.out.println("hi");
    }
}