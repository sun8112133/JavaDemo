package com.sunkuan;

import org.junit.jupiter.api.Test;

import com.sunkuan.exercise.EqualDemo;
import com.sunkuan.util.NumberException;

/**
 * equal方法 测试
 * @author Sunkuan
 *
 */
@SuppressWarnings("all")
public class EqualTest {

	/**
	 * 测试equal1方法
	 * 
	 * @throws NumberException
	 */
	@Test
	public void equal1Test() {
		boolean bool = new EqualDemo().equal1(10, 10);
		System.out.println(bool);
		bool = new EqualDemo().equal1(10, 22);
		System.out.println(bool);
		bool = new EqualDemo().equal1(10, null);
		System.out.println(bool);
		bool = new EqualDemo().equal1(null, null);
		System.out.println(bool);
	}
	
	/**
	 * 测试equal2方法
	 * 
	 * @throws NumberException
	 */
	@Test
	public void equal2Test() {
		boolean bool = new EqualDemo().equal2(10, 10);
		System.out.println(bool);
		bool = new EqualDemo().equal2(10, 22);
		System.out.println(bool);
		bool = new EqualDemo().equal2(10, null);
		System.out.println(bool);
		bool = new EqualDemo().equal2(null, null);
		System.out.println(bool);
	}
	
}
