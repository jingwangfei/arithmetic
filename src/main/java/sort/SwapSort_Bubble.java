package sort;

import java.util.Arrays;

/**
 *  交换排序之, 冒泡排序
 **/
public class SwapSort_Bubble {

    public static void main(String[] args) {

        int[] arr = new int[] { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };

        // 从0开始, 依次将最大的元素, 交互到尾部.
        for (int i = arr.length - 1; i > 0 ; i --) {

            // 从第一个元素开始, 依次与后面的元素比较, 如果大, 能互换
            for (int j = 0; j < i; j ++) {
                if(arr[j] > arr[j+1]) {

                    // 交换元素
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
