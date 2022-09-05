package learning.OOP_advance.single;

//单例模式懒汉式
public class SingleTon2 {
    public static void main(String[] args) {
        System.out.println(Cat.n);
        Cat cat = Cat.getInstance();
        System.out.println(cat);
        Cat cat1 = Cat.getInstance();
        System.out.println(cat1);
    }
}

class Cat {
    private String name;
    private static Cat cat;
    public static int n = 999;

    private Cat(String name) {
        this.name = name;
        System.out.println("构造器被调用");
    }

    public static Cat getInstance() {
        if(cat == null) {
            cat = new Cat("kitty");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
/*
总结：
1.饿汉式再类加载时就创建了对象实例，懒汉式在使用实例时才创建。
2.饿汉式不存在线程安全问题，懒汉式存在线程安全问题
3.饿汉式存在资源浪费问题
 */