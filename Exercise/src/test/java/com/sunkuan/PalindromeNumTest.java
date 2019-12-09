package com.sunkuan;

import org.junit.jupiter.api.Test;

import com.sunkuan.exercise.PalindromeNum;
import com.sunkuan.util.NumberException;

/**
 * 回文数测试
 * @author Sunkuan
 *
 */
public class PalindromeNumTest {
	
	/**
	 * 判断 212 是否是回文数， true
	 * 
	 * @throws NumberException
	 */
	@Test
	public void isPalindrome212Test() throws NumberException {
		boolean bool = PalindromeNum.isPalindrome(212);
		System.out.println(bool);
	}
	
	/**
	 * 判断 -212 是否是回文数，会报 回文数不能是负数 异常
	 * 
	 * @throws NumberException
	 */
	@Test
	public void isPalindromef212Test() throws NumberException {
		boolean bool = PalindromeNum.isPalindrome(-212);
		System.out.println(bool);
	}
	
	/**
	 * 判断 10 是否是回文数，false
	 * 
	 * @throws NumberException
	 */
	@Test
	public void isPalindrome10Test() throws NumberException {
		boolean bool = PalindromeNum.isPalindrome(10);
		System.out.println(bool);
	}
	
}
