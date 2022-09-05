package learning.CommonClass.StringBuffer;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String --> StringBuffer
        //方式一
        String str = "hello";
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式二
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        //StringBuffer --> String
        //方式一
        StringBuffer stringBuffer2 = new StringBuffer("abc");
        String string = stringBuffer2.toString();
        //方式二
        String string1 = new String(stringBuffer2);
    }
}
