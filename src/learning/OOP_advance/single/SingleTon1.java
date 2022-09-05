package learning.OOP_advance.single;

//单例模式饿汉式
public class SingleTon1 {
    public static void main(String[] args) {
        GirlFriend gf = GirlFriend.getInstance();
        System.out.println(GirlFriend.n);
        System.out.println(gf);
        GirlFriend girlFriend = GirlFriend.getInstance();
        System.out.println(girlFriend);
    }
}

//一个人只能有一个女朋友
class GirlFriend {
    private String name;
    public static int n = 999;
    //饿汉式可能造成创建了对象但是没有使用
    private static GirlFriend girlFriend = new GirlFriend("lily");

    private GirlFriend(String name) {
        this.name = name;
        System.out.println("构造器被调用");
    }

    public static GirlFriend getInstance() {
        return girlFriend;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}