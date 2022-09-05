package learning.CommonClass.wrapper;

public class WrapperMethods {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);//最小值
        System.out.println(Integer.MAX_VALUE);//最大值

        System.out.println(Character.isDigit('a'));//判断是否是数字
        System.out.println(Character.isLetter('a'));//判断是否是字母
        System.out.println(Character.isUpperCase('a'));//判断是否是大写
        System.out.println(Character.isLowerCase('a'));//判断是否是小写

        System.out.println(Character.isWhitespace('a'));//判断是否是空格
        System.out.println(Character.toUpperCase('a'));//转成大写
        System.out.println(Character.toLowerCase('a'));//转成小写
    }
}
