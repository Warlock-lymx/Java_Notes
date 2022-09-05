package learning.OOP_advance.innerClass;

/**
 * 演示局部内部类的使用
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.m1();
    }
}

class Outer2 {
    private int n1 = 120;

    private void m2() {
        System.out.println("m2");
    }

    public void m1() {
        //1.局部内部类是定义在外部类的局部位置，通常是方法
        //2.可以直接访问外部类的所有成员，包含私有的
        //3.不能添加访问修饰符，但是可以用final修饰
        //4.作用域：仅仅在定义它的方法或代码块中
        //5.外部类在方法中可以创建Inner2的对象实例，然后调用方法
        //6.如果外部类和局部内部类的成员重名的时候，默认遵循就近原则，如果想访问外部类的成员，则可以使用
        //外部类名.this.成员 访问
        class Inner2 {//局部内部类
            private int n1 = 800;

            public void f1() {
                System.out.println("内部类n1：" + n1);
                //Outer2.this本质上就是外部类的对象，哪个对象调用了m1，Outer2.this就是哪个对象
                System.out.println("外部类n1：" + Outer2.this.n1);
                m2();
            }
        }

        final class Inner3 extends Inner2 {

        }

        Inner2 inner2 = new Inner2();
        inner2.f1();
    }
}