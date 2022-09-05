package learning.collection.set.hashset;

import java.util.LinkedHashSet;
import java.util.Objects;

public class Linked_HashSet {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥迪",30000));
        linkedHashSet.add(new Car("奥拓",10000));
        linkedHashSet.add(new Car("宝马",40000));
        linkedHashSet.add(new Car("奔驰",50000));
        linkedHashSet.add(new Car("奥迪",30000));//加入不了
        System.out.println(linkedHashSet);
    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //重写equals，当name和price相同时，返回相同的hashcode，equals也相同
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}