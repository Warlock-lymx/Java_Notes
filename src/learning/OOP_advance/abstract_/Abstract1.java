package learning.OOP_advance.abstract_;

public class Abstract1 {
    public static void main(String[] args) {
        Cat kitty = new Cat("kitty");
        kitty.eat();
        kitty.speak();
    }
}
//1.抽象类不可以被实例化
//2.抽象类可以没有抽象方法，还可以有已经实现了的方法
//3.抽象类可以有任意的成员
//4.如果一个类机车过了抽象类，则它必须实现抽象类的所有抽象方法，除非她自己也声明为抽象类
//5.抽象方法不能使用private、final和static修饰
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void speak();

    public void hi() {
        System.out.println("hi");
    }
}

class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("猫吃老鼠");
    }

    public void speak() {
        System.out.println("小猫喵喵叫");
    }
}