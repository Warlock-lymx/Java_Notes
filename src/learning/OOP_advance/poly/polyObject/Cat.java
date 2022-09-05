package learning.OOP_advance.poly.polyObject;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void cry(){
        System.out.println("小猫喵喵叫");
    }

    public void catchmouse() {
        System.out.println("小猫抓老鼠");
    }
}
