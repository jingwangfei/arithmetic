package sort;

import java.util.Arrays;

/**
 *
 *  归并排序
 **/
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[] { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }


    public static void mergeSort(int[] arr, int beginIndex, int endIndex) {

        // 如果, 只有一个元素, 则退出
        if (endIndex == beginIndex) {
            return;
        }

        // 中间索引
        int midIndex = (beginIndex + endIndex) / 2;

        // 递归, 对左序列进行排序
        mergeSort(arr, beginIndex, midIndex);

        // 递归, 对右序列进行排序
        mergeSort(arr, midIndex + 1, endIndex);

        // 归并, 左右已经排好序的序列
        int[] arrTemp =  new int[endIndex - beginIndex + 1];
        int temp = 0;
        int i = beginIndex;
        int j = midIndex + 1;

        // 归并
        while (i <= midIndex && j <= endIndex) {
            if(arr[i] < arr[j]) {
                arrTemp[temp++] = arr[i++];
            } else {
                arrTemp[temp++] = arr[j++];
            }
        }

        // 如果还有剩余的, 则直接复制数据
        for (; i <= midIndex; i ++) {
            arrTemp[temp++] = arr[i];
        }

        for (; j <= endIndex; j ++) {
            arrTemp[temp++] = arr[j];
        }

        // 将temp, 从新, 复制到原数组
        System.arraycopy(arrTemp, 0, arr, beginIndex, arrTemp.length);
    }
}

