package learning.generic;

public class Generic1 {
    public static void main(String[] args) {
        Person<String> person = new Person<>("tom");
        person.show();
    }
}

class Person<E> {
    E s;

    public Person(E s) {
        this.s = s;
    }

    public E f() {
        return s;
    }

    public void show() {
        System.out.println(s.getClass());
    }
}