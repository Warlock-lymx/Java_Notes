package learning.enumeration;

public class Enum1 {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);

        System.out.println(Season.AUTUMN);
    }
}

//自定义枚举类
class Season {
    private String name;
    private String desc;

    //构造器私有化，防止在类外部被new()
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public static final Season SPRING = new Season("春天","温暖");
    public static final Season SUMMER = new Season("夏天","炎热");
    public static final Season AUTUMN = new Season("秋天","凉爽");
    public static final Season WINTER = new Season("冬天","寒冷");

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
