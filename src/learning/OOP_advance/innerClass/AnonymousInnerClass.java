package learning.OOP_advance.innerClass;

/**
 * 演示匿名内部类
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        outer3.method();
    }
}

class Outer3 {
    private int n1 = 10;

    public void method() {
        //基于接口的匿名内部类
        //jdk底层在创建匿名内部类Outer3$1后，立即就创建了Outer3$1实例，并且把地址返回给dog
        IA dog = new IA() {//编译类型：IA    运行类型：系统创建的匿名内部类Outer3$1
            @Override
            public void cry() {
                System.out.println("小狗汪汪");
            }
        };
        System.out.println("dog的运行类型为" + dog.getClass());
        dog.cry();

        //基于类的匿名内部类
        Father father = new Father("jack") {//编译类型：Father    运行类型：系统创建的匿名内部类Outer3$2
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father的运行类型为" + father.getClass());
        father.test();

        new Father("tom") {
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        }.test();
    }
}

interface IA {
    public void cry();
}

class Father {
    public Father(String name) {
        System.out.println("接收到"+name);
    }

    public void test() {
        System.out.println("test");
    }
}