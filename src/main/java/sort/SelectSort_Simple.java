package sort;

import java.util.Arrays;

/**
 *
 *   选择排序之, 简单选择排序
 **/
public class SelectSort_Simple {


    /**
     *  核心思想: 选择出, 最大的, 或者是最小的元素, 放到头部, 或者是尾部
     */
    public static void main(String[] args) {
        int[] arr = new int[] { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };

        // 每次循环, 找到剩余序列中, 最大的元素, 保存到最后一个元素
        for (int i = arr.length - 1; i > 0; i --) {

            // 从序列[0-i]中, 找到最大的元素
            int maxIndex = i;
            for(int j = i-1; j >= 0; j --) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // 互换元素
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
