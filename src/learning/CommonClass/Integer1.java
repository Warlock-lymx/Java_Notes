package learning.CommonClass;

public class Integer1 {
    public static void main(String[] args) {
        //演示int <--> Integer的装箱和拆箱
        int n1 = 10;
        //手动装箱
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);
        //手动拆箱
        int i = integer.intValue();

        //自动装箱
        int n2 = 20;
        Integer integer2 = n2;
        //自动拆箱
        int n3 = integer;

        //面试题
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1==i2);//F new后为不同对象

        Integer i3 = 127;//底层为Integer.valueOf(127)
        Integer i4 = 127;//-128~127直接从静态数组返回
        System.out.println(i3==i4);//T

        Integer i5 = 127;
        Integer i6 = new Integer(127);
        System.out.println(i5==i6);//F

        Integer i7 = 128;
        int i8 = 128;
        System.out.println(i7==i8);//T 只要有基本类型，判断的是值是否相等


    }
}
