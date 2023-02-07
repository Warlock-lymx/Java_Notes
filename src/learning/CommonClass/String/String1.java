package learning.CommonClass.String;

public class String1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1 == s2);//T
        System.out.println(s1.equals(s3));//T
        System.out.println(s1 == s3);//F
        //当调用 intern 方法时，如果池已经包含一个等于此 String对象的字符串，
        //则返回池中的字符串。否则，将此 String 对象添
        //加到池中，并返回此 String 对象的引用
        //intern最终返回的是常量池的地址
        System.out.println(s1 == s3.intern());//T
        System.out.println(s3 == s3.intern());//F


        String a = "hello";//创建a对象
        String b = "world";//创建b对象
        //1.先创建一个StringBuilder sb = StringBuilder()
        //2.执行sb.append("hello")
        //3.sb.append("world")
        //4.String c = sb.toString()
        //最终其实是c指向堆中的对象(String)value[]->常量池中的"helloworld"
        String c = a + b;//共创建了三个对象
        //String c1 = "a"+"b" 常量相加最终在池中
        //String c2 = a + b 变量相加最终在堆中
    }
}

