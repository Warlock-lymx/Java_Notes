package learning.enumeration;

import java.util.Arrays;

public class EnumMethod {
    public static void main(String[] args) {
        Season1 autumn = Season1.AUTUMN;
        //name():输出枚举对象的名字
        System.out.println(autumn.name());
        //ordinal():输出该枚举对象的编号(从0开始)
        System.out.println(autumn.ordinal());
        //values():返回Season1[],含定义的所有枚举对象
        Season1[] values = Season1.values();
        System.out.println(Arrays.toString(values));
        //valueOf():把字符串转换为已有对象，若没有相匹配的对象则会报错
        Season1 summer = Season1.valueOf("SUMMER");
        System.out.println(summer);
        //compareTo:比较两个枚举常量,比较的就是编号,返回前后两个编号相减的结果
        System.out.println(Season1.SPRING.compareTo(Season1.SUMMER));
    }

}
