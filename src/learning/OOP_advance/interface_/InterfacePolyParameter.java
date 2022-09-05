package learning.OOP_advance.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        //接口的多态
        //接口类型的变量可以指向实现了此接口的对象实例
        IF if01 = new Ship();
        if01 = new Car();
    }
}

interface IF {
}

class Ship implements IF {
}

class Car implements IF {
}