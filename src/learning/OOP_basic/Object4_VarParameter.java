package learning.OOP_basic;

public class Object4_VarParameter {
    public static void main(String[] args) {
        Cal a = new Cal();
        System.out.println(a.sum(1,2,3,4,5));
        //可变参数的实参可以是数组
        int[] arr = {1,2,3};
        System.out.println(a.sum(arr));
    }
}


class Cal{
//可变参数
    //int... 表示可变参数，既可以接收0-多个参数
    //使用可变参数时，nums可以当作数组
    public int sum(int... nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res += nums[i];
        }
        return res;
    }
    //可变参数可以和普通类型的参数放在形参列表中，但必须保证可变参数在最后
    public void test(String str, int... nums){

    }
    // 一个形参列表最多出现一个可变参数

}
