package learning.OOP_advance.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu stu = new Stu("tom");
        Stu stu1 = new Stu("jack");
        stu.pay(100);
        stu1.pay(200);
        Stu.show();
    }
}

class Stu {
    private String name;
    private static double fee = 0;//所有学生累计学费

    public Stu(String name) {
        this.name = name;
    }

    public void pay(double fee) {
        Stu.fee += fee;
    }

    public static void show() {
        System.out.println("总学费：" + fee);
    }
}
