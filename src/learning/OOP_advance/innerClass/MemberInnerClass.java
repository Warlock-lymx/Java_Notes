package learning.OOP_advance.innerClass;

/**
 * 演示成员内部类
 */
public class MemberInnerClass {
    public static void main(String[] args) {
        Outer4 outer4 = new Outer4();
        outer4.t1();
        System.out.println("--------");
        //外部其他类使用成员内部类
        //第一种
        Outer4.Inner4 inner4 = outer4.new Inner4();
        inner4.say();
        //第二种 在外部类中编写一个方法返回一个内部类实例
        Outer4.Inner4 inner41 = outer4.getInner();
        inner41.say();
    }
}

class Outer4 {
    private String name = "tom";
    //1.成员内部类可以使用任何访问修饰符
    //2.外部类可以直接访问成员内部类的成员
    //3.成员内部类也可以直接访问外部类的成员
    public class Inner4 {
        private int n = 20;
        public void say() {
            //可以访问外部类的所有成员
            System.out.println("hello " + name);
        }
    }
    public Inner4 getInner() {
        return new Inner4();
    }

    public void t1() {
        Inner4 inner4 = new Inner4();
        inner4.say();
        System.out.println(inner4.n);
    }
}