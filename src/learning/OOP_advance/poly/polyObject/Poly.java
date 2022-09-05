package learning.OOP_advance.poly.polyObject;

public class Poly {
    public static void main(String[] args) {
        //编译类型：Animal    运行类型：Dog
        Animal animal = new Dog("小狗1");
        animal.cry();
        //编译类型：Animal    运行类型：Cat
        animal = new Cat("小猫");
        animal.cry();

        Dog dog = new Dog("小狗2");
        Master master = new Master();
        master.feed(dog);

        //向上转型
        Animal animal1 = new Cat("小猫2");
        //可以调用父类的所有成员，但不能调用子类的特有成员
//        animal.catchmouse();错误的

        //向下转型
        Cat cat = (Cat) animal1;
        cat.catchmouse();

        Base base = new Sub();
        //属性没有重写，只看编译类型
        System.out.println(base.num);
        //instanceof比较符，判断对象的运行类型是否为xx类型或者xx类型的子类型
        System.out.println(base instanceof Base);
        System.out.println(base instanceof Sub);
    }

}

class Base{
    int num = 10;
}

class Sub extends Base{
    int num = 20;
}