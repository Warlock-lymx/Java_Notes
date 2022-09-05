package learning.CommonClass.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();//返回当前日期时间
        System.out.println(ldt);
        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm:ss E");
        String format = dateTimeFormatter.format(ldt);
        System.out.println(format);

        //890天后的日期时间
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println(dateTimeFormatter.format(localDateTime));
        //29分钟前的时间
        LocalDateTime localDateTime1 = ldt.minusMinutes(29);
        System.out.println(dateTimeFormatter.format(localDateTime1));
    }
}
