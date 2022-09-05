package learning.CommonClass.wrapper;

public class WrapperVSString {
    public static void main(String[] args) {
        //包装类(Integer)->String
        Integer i = 100;
        //方式一
        String str1 = i + "";
        //方式二
        String ste2 = i.toString();
        //方式三
        String str3 = String.valueOf(i);

        //String->包装类(Integer)
        String str = "123";
        //方式一
        Integer i1 = Integer.parseInt(str);
        //方式二
        Integer i2 = new Integer(str);

    }
}
