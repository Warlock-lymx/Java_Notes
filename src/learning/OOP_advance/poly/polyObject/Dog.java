package learning.OOP_advance.poly.polyObject;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void cry(){
        System.out.println("小狗汪汪叫");
    }
}
