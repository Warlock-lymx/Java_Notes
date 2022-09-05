package learning.CommonClass.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysMethods {
    public static void main(String[] args) {
        Integer[] integers = {1, 20, 90};
        //遍历
        System.out.println(Arrays.toString(integers));

        //排序
        Integer[] arr = {1, -1, 7, 9, 29};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));

        Integer[] tmp = {1, 3, 5, 80, 89};
        //二叉查找(要求数组有序)
        //如果不存在，返回的是假设存在应该在的索引+1取反
        int index = Arrays.binarySearch(tmp, 80);
        System.out.println(index);

        //数组拷贝
        Integer[] temp = Arrays.copyOf(tmp, tmp.length - 1);
        System.out.println(Arrays.toString(temp));

        //数组元素填充
        Integer[] num = {9, 3, 2};
        Arrays.fill(num, 99);
        System.out.println(Arrays.toString(num));

        //比较两个数组是否相等(顺序也一致)
        Integer[] array = {-1, 1, 7, 9, 29};
        Integer[] array1 = {1, -1, 7, 9, 29};
        System.out.println(array.equals(array1));

        //将数组转换为List
        List<Integer> asList = Arrays.asList(arr);
        System.out.println(asList);
    }
}
