package learning.CommonClass.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ {
    public static void main(String[] args) throws ParseException {
        java.util.Date d1 = new java.util.Date();//获取当前系统时间
        System.out.println(d1);

        java.util.Date d2 = new java.util.Date(9234567);//通过指定毫秒数得到时间
        System.out.println(d2);

        //指定相应的日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);//将日期转换成指定格式的字符串
        System.out.println(format);

        //把一个格式化的字符串转成对应的date
        String s = "1996年10月18日 10:23:19 星期一";
        java.util.Date date = sdf.parse(s);
        System.out.println(sdf.format(date));
    }
}
