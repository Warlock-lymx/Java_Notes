package learning.CommonClass.BigNum;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("299999999999999999999999999999999");
        BigInteger bigInteger1 = new BigInteger("100");
        BigInteger add = bigInteger.add(bigInteger1);//加
        System.out.println(add);
        BigInteger sub = bigInteger.subtract(bigInteger1);//减
        System.out.println(sub);
        BigInteger multi = bigInteger.multiply(bigInteger1);//乘
        System.out.println(multi);
        BigInteger divide = bigInteger.divide(bigInteger1);//除
        System.out.println(divide);
    }
}
