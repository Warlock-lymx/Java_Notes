package learning.OOP_advance.extend;

//Pupil和Graduate的父类
public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    //无参构造器
    public Student() {
    }

    //有参构造器
    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void info() {
        System.out.println("name:" + name + " age:" + age + " score:" + score);
    }
}
/*
1.子类无法直接访问父类的私有和默认属性、方法，需要调用公共的方法
2.子类必须调用父类的构造器，完成父类的初始化
3.当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，如果父类没有，
  则必须在子类的构造器中用super取指定使用父类的哪个构造器
4.关键字super和this在使用时，必须放在构造器的第一行，并且两个关键字不能同时使用
5.Object是所有类的父类
 */