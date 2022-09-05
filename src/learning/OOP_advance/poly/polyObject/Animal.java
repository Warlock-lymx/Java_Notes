package learning.OOP_advance.poly.polyObject;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void cry(){
        System.out.println(name+"叫");
    }
}
