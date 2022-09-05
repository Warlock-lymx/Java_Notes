package learning.OOP_basic;

public class Object5_constructor {
    public static void main(String[] args) {
        P p1 = new P("jack", 18);
        P p2 = new P("leo");
        P p3 = new P();
    }
}

class P {
    String name;
    int age;

    //默认的无参构造器
    public P() {
    }

    //构造器
    public P(String pname, int page) {
        name = pname;
        age = page;
    }

    //构造器重载
    public P(String pname) {
        this("jack", 19);
        name = pname;
    }
}