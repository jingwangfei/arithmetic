package arithmetic.sort;

import java.util.Arrays;

/**
 *  交换排序之, 快速排序
 **/
public class SwapSort_Fast {

	/**
	 *  核心思想:
	 *  	选择基准数, 将基准数归位;
	 *  	再采用分治的思想, 对剩余的序列进行处理
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };

		fastSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}


	/**
	 * 对指定索引范围的元素, 进行快速排序
	 *
	 */
	public static void fastSort(int[] arr, int beginIndex, int endIndex) {

		// 若, 元素中, 只有一个元素, 那么就直接退出
		// 或者是, endIndex, 大于 beginIndex情况下, 也退出
		if (endIndex <= beginIndex) {
			return ;
		}

		// 基准数, 索引
		int baseIndex = beginIndex;

		/**
		 * 找到正确的位置, 将基准数归位
		 * 先从右向左循环, 找到小于基准数的元素; 再从左向右循环,找到大于基准数的元素; 交换; 直到相遇
 		 */
		int i = beginIndex; // 后向指针
		int j = endIndex; // 前向指针
		while (j != i) {
			while (j != i && arr[j] > arr[baseIndex]) {
				j--;
			}

			while (j != i && arr[i] <= arr[baseIndex]) {
				i++;
			}

			if(j != i) {
				// 向前, 和向后指针, 元素进行交换
				swap(arr, i, j);
			}
		}

		// i,j相遇, 找到正确位置, 进行交换
		swap(arr, i, baseIndex);

		// 分治, 递归, 对左子序列进行处理
		fastSort(arr, beginIndex, i - 1);

		// 分治, 递归, 对右子序列进行处理
		fastSort(arr, i + 1, endIndex);
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
