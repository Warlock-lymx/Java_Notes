package learning.CommonClass.BigNum;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1999.229938891298101");
        BigDecimal bigDecimal1 = new BigDecimal("1.2");
        System.out.println(bigDecimal);

        BigDecimal add = bigDecimal.add(bigDecimal1);//加
        System.out.println(add);
        BigDecimal sub = bigDecimal.subtract(bigDecimal1);//减
        System.out.println(sub);
        BigDecimal multi = bigDecimal.multiply(bigDecimal1);//乘
        System.out.println(multi);
        //除不尽时增加精度
        BigDecimal divide = bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_DOWN);//除
        System.out.println(divide);
    }
}
