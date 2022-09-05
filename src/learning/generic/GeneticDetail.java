package learning.generic;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.Arrays;

public class GeneticDetail {
    public static void main(String[] args) {
        Dog<A> aDog = new Dog<>(new A());
        //在给泛型类型制定具体类型后，可以传入该类型或其子类型
        Dog<A> aDog1 = new Dog<>(new B());

    }
}

class A{}
class B extends A{}

class Dog<E> {
    E e;

    public Dog(E e) {
        this.e = e;
    }
}