package learning.collection.set.hashset;

import java.util.HashSet;

public class HashSet_ {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        //1.在执行add方法后，会返回一个boolean值，添加成功为true
        System.out.println(hashSet.add("jhon"));
        System.out.println(hashSet.add("jhon"));

        hashSet.add(new Dog("tom"));
        hashSet.add(new Dog("tom"));
        System.out.println(hashSet);

        hashSet.add(new String("jack"));
        hashSet.add(new String("jack"));//无法加入
        System.out.println(hashSet);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}