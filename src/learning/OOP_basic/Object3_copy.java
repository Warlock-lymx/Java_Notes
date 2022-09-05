package learning.OOP_basic;

public class Object3_copy {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "jack";
        p.age = 18;
        MyTools tool = new MyTools();
        Person cp = tool.copy(p);
        System.out.println(cp.name + " " + cp.age);
    }
}

class Person {
    String name;
    int age;
}

class MyTools {
    //克隆对象
    public Person copy(Person p) {
        Person p1 = new Person();
        p1.name = p.name;
        p1.age = p.age;
        return p1;
    }
}