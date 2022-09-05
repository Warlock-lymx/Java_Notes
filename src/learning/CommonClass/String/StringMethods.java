package learning.CommonClass.String;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));//忽略大小写

        String s = "whi@cp@";
        System.out.println(s.indexOf("@"));//获取指定字符第一次出现的索引，找不到返回-1
        System.out.println(s.lastIndexOf("@"));//获取指定字符最后一次出现的索引，找不到返回-1
        System.out.println(s.substring(4));//截取索引6后面所有字符

        String s1 = "nike";
        String s2 = "Nike";
        System.out.println(s1.toUpperCase());//变为大小写
        System.out.println(s2.toLowerCase());

        String string  = "a";
        string = string.concat("b").concat("c");//拼接字符串
        System.out.println(string);

        String s3 = "南开大学坐落于南开区";
        s3 = s3.replace("南开大学","天津大学");
        System.out.println(s3);

        String a = "jchn";
        String b = "jack";
        System.out.println(a.compareTo(b));//比较字符串大小

        String name = "jack";
        char gender = '男';
        int age = 18;
        double score = 98.3/3;
        String info = String.format("我的姓名是%s,年龄是%d,性别是%c,成绩是%.2f",name,age,gender,score);
        System.out.println(info);
    }
}
