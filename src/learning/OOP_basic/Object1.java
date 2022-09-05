package learning.OOP_basic;

public class Object1 {
    public static void main(String[] args){
        Person1 a = new Person1();
        a.name = "小白";
        a.age = 3;
//        Person cat2 = cat1;
//        cat2 = null;
//        System.out.println(cat2.age);//异常
        a.speak();
        int sum = a.cal(5);
    }
}

class Person1 {
    //属性
    String name;
    int age;
    //方法
    public void speak(){
        System.out.println("我是一个好人");
        //调用同一个类中的方法不需要创建对象
        cal(3);
        //跨类调用方法需要先创建对象
        Person2 b = new Person2();
        b.hello();
    }
    public int cal(int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
        return sum;
    }
class Person2{
        public void hello(){
            System.out.println("hello");
        }
}
}