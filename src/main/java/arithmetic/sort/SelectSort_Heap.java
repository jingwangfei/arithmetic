package arithmetic.sort;

import java.rmi.dgc.Lease;
import java.util.Arrays;

/**
 *
 *  选择排序之, 堆排序
 **/
public class SelectSort_Heap {

    public static void main(String[] args) {

        int[] arr = new int[] { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };

        maxHeapSort(arr);

        System.out.println(Arrays.toString(arr));
    }


    /**
     * 最大堆排序
     *
     */
    public static void maxHeapSort(int[] arr) {
        // 初始化, 最大堆
        initHeap(arr);

        // 依次, 将最大的数据, 进行归位
        for (int i = arr.length - 1; i > 0; i --) {

            // 将第一个元素, 和最后一个元素, 进行交换
            swap(arr, 0, i);

            // 对第一个元素进行调整
            adjustment(arr, 0, i - 1);
        }
    }

    /**
     * 将数组, 初始化, 最大堆
     *
     */
    public static void initHeap(int[] arr) {

        // 从最后一个非叶子节点开始, 进行遍历处理
        int startIndex = (arr.length - 2) / 2 ;
        for (int index = startIndex; index >= 0; index --) {
            adjustment(arr, index, arr.length - 1);
        }
    }

    /**
     *  对某一数组, 指定索引, 为根的树, 进行调整.
     *  假设, 其子树, 已经具有, 最大堆的特性.
     *
     */
    public static void adjustment(int[] arr, int index, int endIndex) {
        // 根, 左, 右节点中, 值最大元素的索引
        int maxIndex = index;

        // 左节点索引
        int leftIndex = 2 * index + 1;

        // 右节点索引
        int rightIndex = 2 * index + 2;

        // 左节点存在, 并且大于当前的最大值
        if(leftIndex <= endIndex && arr[leftIndex] > arr[maxIndex]){
            maxIndex = leftIndex;
        }
        // 右节点存在, 并且大于当前的最大值
        if (rightIndex <= endIndex && arr[rightIndex] > arr[maxIndex]) {
            maxIndex = rightIndex;
        }

        // 如果, 左右子节点的值, 比跟节点的大, 则交换元素
        if (maxIndex != index) {
            swap(arr, maxIndex, index);

            // 递归调整子树
            adjustment(arr, maxIndex, endIndex);
        }
    }

    /**
     *  交换元素
     *
     */
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
