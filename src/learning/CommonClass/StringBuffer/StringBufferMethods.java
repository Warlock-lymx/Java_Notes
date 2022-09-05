package learning.CommonClass.StringBuffer;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");

        //增
        stringBuffer.append(",world").append(100).append(true);
        System.out.println(stringBuffer);

        //删
//        stringBuffer.delete(2,5);
        System.out.println(stringBuffer);

        //改
        stringBuffer.replace(6,11,"jack");
        System.out.println(stringBuffer);

        //查
        int index = stringBuffer.indexOf("jack");
        System.out.println(index);

        //插入
        stringBuffer.insert(10,",mike");
        System.out.println(stringBuffer);


        //练习
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);//null

        StringBuffer sb1 = new StringBuffer(str);//空指针异常
        System.out.println(sb1);

    }
}
