package learning.enumeration;

public class Enum2 {
    public static void main(String[] args) {
        System.out.println(Season1.SPRING);
    }
}

//使用enmu关键字实现枚举类
enum Season1 {
    //定义的常量对象要写在最前面
    SPRING("春天", "温暖"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽"),
    WINNER("冬天", "寒冷");

    private String name;
    private String desc;

    //构造器私有化，防止在类外部被new()
    private Season1(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

}