package com.zeroten.common.util;

/**
 * 数据验证工具类
 * @author SunKuan
 * @create 2019-12-12
 * @since 1.0
 *
 */
public class CheckUtils {

	/**
	 * 判断参数数组中元素是否为空
	 * String... strings 为可变参数，你可以认为它是 String[] strings。
	 * 如果 strings 中有任意一个字符串为空，则返回 false，否则返回 true。
	 * @param strings
	 * @return
	 */
	public static boolean isAnyEmpty(String... strings) {
		if (isEmpty(strings)) {
			return false;
		}
		for (String str : strings) {
			if (str == null || "".equals(str.trim())) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 判断引用类型数组是否为空
	 * 为空或 null 则返回 true，否则返回 false。
	 * @param arr
	 * @return
	 */
	public static boolean isEmpty(Object[] arr) {
		return (arr != null && arr.length > 0) ? false : true;
	}
	
	/**
	 * 判断 str1 字符串是否相等
	 * 相等则返回 true，否则返回 false。当其中一个是 null 时返回 false。
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean equals(String str1, String str2) {
		return (str1 != null && str1.equals(str2)) ? true : false;
	}
	
	/**
	 * 判断 n1 和 n2 的值是否相等
	 * 相等则返回 true，否则返回 false。当其中一个是 null 时返回 false。
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static boolean equals(Integer n1, Integer n2) {
		return (n1 != null && n1.equals(n2)) ? true : false;
	}
	
}
