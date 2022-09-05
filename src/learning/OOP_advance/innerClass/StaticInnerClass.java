package learning.OOP_advance.innerClass;

/**
 * 演示静态内部类
 */
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer5 outer5 = new Outer5();
        outer5.m1();

        //外部其他类使用静态内部类
        //方法一
        Outer5.Inner5 inner5 = new Outer5.Inner5();
        inner5.say();
        //方法二
        Outer5.Inner5 inner51 = Outer5.getInner();
    }
}

class Outer5 {
    private int n1 = 10;
    public static String name = "jack";

    //1.放在外部类的成员位置
    //2.可以访问外部类的所有静态成员，不能访问非静态成员
    //3.可以添加任何访问修饰符
    public static class Inner5 {
        private int n1 = 20;
        public static String name = "tom";
        public void say() {
            System.out.println(name);
            System.out.println(Outer5.name);
        }
    }

    public static Inner5 getInner() {
        return new Inner5();
    }

    public void m1() {
        Inner5 inner5 = new Inner5();
        inner5.say();
    }
}