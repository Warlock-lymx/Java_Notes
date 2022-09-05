package learning.CommonClass.StringBuffer;

public class StringBuffer_ {
    public static void main(String[] args) {
        //1.父类AbstractStringBuffer 中有属性char[]value，不是final类型，该value数组中
        //存放字符串内容，存放在堆
        //2.StringBuffer 是一个final类，不能被继承
        //3.因为StringBuffer字符内容是存在char[] value，所有变化不用每次都更换地址，因此效率较高

        //构造器
        StringBuffer stringBuffer = new StringBuffer();//char[] 大小为16
        StringBuffer stringBuffer1 = new StringBuffer(100);//char[] 大小为100
        StringBuffer stringBuffer2 = new StringBuffer("hello");//char[] 大小为 5+16=21


    }
}
