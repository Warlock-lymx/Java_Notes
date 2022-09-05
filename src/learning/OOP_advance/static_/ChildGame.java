package learning.OOP_advance.static_;

public class ChildGame {
    public static void main(String[] args) {
        Child child = new Child("小明");
        child.join();
        Child child1 = new Child("小华");
        child.join();
        Child child2 = new Child("小丽");
        child.join();
        System.out.println(Child.count);
    }
}

class Child {
    private String name;
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        count++;
        System.out.println(name + "加入了游戏");
    }
}