package com.sunkuan.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sunkuan.util.NumberException;

/**
 * Palindrome Number
 * @author Sunkuan
 * @create 2019-12-6
 * @since 1.0
 *
 */
public class PalindromeNum {

	/**
	 * 判断一个整数是否是回文数
	 * @param x 整数
	 * @return
	 * @throws NumberException 
	 */
	public static boolean isPalindrome(int x) throws NumberException {
		// 校验数字
		if (x < 0) {
			throw new NumberException("回文数不能是负数");
		}
		List<Integer> nums = new ArrayList<>();  // 存放回文数中的每一位数字
		String xStr = String.valueOf(x);
		// 获取回文数中的每一位数字
		for (int i = 1; i <= xStr.length(); i ++) {
			int height = (int) Math.pow(10, xStr.length() - i);  // 当前最高位
			int num = x / height;
			nums.add(num);
			x = x - num*height;
		}
		// 翻转数字
		List<Integer> numsReverse = new ArrayList<>();
		numsReverse.addAll(nums);
		Collections.reverse(nums);
		// 比较翻转前后是否一致，为true就是回文数
		if (nums.equals(numsReverse)) {
			return true;
		}
		return false;
	}
	
}
