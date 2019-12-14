package com.zeroten.common.util;

/**
 * 数组工具类
 * @author SunKuan
 * @create 2019-12-14
 * @since 1.0
 *
 */
public class ArrayUtils {
	
	/**
	 * 对传入的 int 数组进行排序，从小到大，并返回排序后的结果
	 * @param arr
	 * @return
	 */
	public static int[] sort(int[] arr) {
		if (arr != null && arr.length > 0) {
			for (int i = 0; i < arr.length - 1; i ++) {
				for (int j = 0; j < arr.length - i - 1; j ++) {
					if (arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			return arr;
		}
		return null;
	}
	
}
