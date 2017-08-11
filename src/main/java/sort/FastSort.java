package sort;

import java.util.Arrays;

public class FastSort {

	/**
	 * 快速排序
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };

		System.out.println(Arrays.toString(arr));
		fastSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}

	/*
	 * 递归进行数字归位
	 */
	public static void fastSort(int[] arr, int beginIndex, int endIndex) {

		if (null == arr || arr.length == 0) {
			return;
		}

		// 递归结束条件
		if (beginIndex > endIndex || beginIndex < 0) {
			return;
		}

		// 递归
		int baseIndex = beginIndex;
		int baseValue = arr[baseIndex];
		int leftP = beginIndex;
		int rightP = endIndex;

		while (leftP != rightP) {

			while (arr[rightP] >= baseValue && leftP < rightP) {
				rightP--;
			}

			while (arr[leftP] <= baseValue && leftP < rightP) {
				leftP++;
			}

			if (leftP < rightP) {
				swap(arr, leftP, rightP);
			}

		}

		swap(arr, baseIndex, leftP);

		// 对左序列进行归为
		fastSort(arr, beginIndex, leftP - 1);

		// 对右序列进行归位
		fastSort(arr, leftP + 1, endIndex);
	}

	/*
	 * 交互数据
	 */
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
