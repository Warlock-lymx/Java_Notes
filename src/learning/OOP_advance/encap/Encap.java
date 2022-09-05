package learning.OOP_advance.encap;

public class Encap {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(3000);
        System.out.println(person.info());
        Person person1 = new Person("peter",200,5000);
        System.out.println(person1.info());
    }

}

class Person {
    private String name;
    private int age;
    private double salary;

    //构造器
    public Person() {
    }

    public Person(String name, int age, double salary) {
        //这样防护机制就被破解了
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //可以将set方法写在构造器中，这样仍然具有防护机制
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    //快捷键 alt+insert 书写 set()和get()方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("姓名格式不符");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 100) {
            this.age = age;
        }
        else{
            System.out.println("年龄格式不符");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "个人信息为 name:" + name + " age:" + age + " salary:" + salary;
    }
}