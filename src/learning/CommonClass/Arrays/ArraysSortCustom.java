package learning.CommonClass.Arrays;

import sun.awt.datatransfer.DataTransferer;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1, -1, 8, 0, 20};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

        bubblePlus(arr, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer i1, Integer i2) {
                        return i2 - i1;
                    }
                }
        );
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void bubblePlus(int[] arr, Comparator c) {
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
