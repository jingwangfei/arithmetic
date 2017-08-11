package sort;

import java.util.Arrays;

/**
 *  插入排序之, 直接插入排序
 **/
public class InsertSort_Direct {

    /**
     *  核心思想, 将一个元素, 插入到有序序列中.
     */
    public static void main(String[] args) {

        int[] arr = new int[] { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };

        // 从下标1开始;
        // 每次, 循环, 都插入一个元素;
        // 直到最后一个元素
        for (int i = 1; i < arr.length; i ++) {

            // x 代表将要插入的元素
            // 从上一个元素开始, 如果小于, 什么事, 也不做
            // 如果大于, 则交互元素; 并依次向前推进; 直到遇到小于的, 或者是到达第一个元素, 退出.
            int x = i;
            while(x > 0 && arr[x-1] > arr[x]) {

                // 交换元素
                int temp = arr[x];
                arr[x] = arr[x-1];
                arr[x-1] = temp;

                // x向前移动
                x--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
