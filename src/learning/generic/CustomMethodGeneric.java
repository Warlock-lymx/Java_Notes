package learning.generic;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run("jack",100);//调用方法时，传入参数，编译器会确定类型
        Fish<String,Integer> fish = new Fish<>();
        fish.swim("mike",100);
    }
}

//普通类
class Cat {
    public <T, R> void run(T t, R r) {//泛型方法
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}

//泛型类
class Fish<T, R> {
    public <U, M> void swim(U u, M m) {//泛型方法

    }
}