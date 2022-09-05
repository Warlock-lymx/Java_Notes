package learning.OOP_basic;

public class Object2 {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        A a = new A();
        a.test(arr);
        //调用方法后形参可以影响实参，因为数组存储的是数组的地址，真正的数据存在堆中，传递对象时亦然
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
class A{
    public void test(int[] arr){
        arr[0] = 100;
    }
}