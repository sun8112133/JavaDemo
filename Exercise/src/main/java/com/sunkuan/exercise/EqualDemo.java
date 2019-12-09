package com.sunkuan.exercise;

/**
 * 编写一个函数 boolean equal(Integer n1, Integer n2) 
 * 比较两个数值是否相等，相等则返回 true，否则返回 false。
 * 
 * @author Sunkuan
 * @create 2019-12-4
 * @since 1.0
 *
 */
public class EqualDemo {

	/**
	 * 第一种方法
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static boolean equal1(Integer n1, Integer n2) {
		if (n1 == n2) {
			return true;
		}
		if (n1 == null || n2 == null) {
			return false;
		}
		if (n1.equals(n2)) {
			return true;
		}
		return false;
	}

	/**
	 * 第二种方法
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static boolean equal2(Integer n1, Integer n2) {
		if (n1 == n2) {
			return true;
		}
		if (n1 == null || n2 == null) {
			return false;
		}
		int i1 = n1.intValue();
		int i2 = n2.intValue();
		if (i1 == i2) {
			return true;
		}
		return false;
	}

}
