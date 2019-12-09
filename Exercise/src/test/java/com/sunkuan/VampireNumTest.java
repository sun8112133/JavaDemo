package com.sunkuan;

import java.util.Set;

import org.junit.jupiter.api.Test;

import com.sunkuan.exercise.VampireNum;
import com.sunkuan.util.NumberException;

/**
 * 吸血鬼数字测试
 * @author Sunkuan
 *
 */
public class VampireNumTest {

	/**
	 * 测试找出4位的吸血鬼数字 及 个数
	 * 
	 * @throws NumberException
	 */
	@Test
	public void vamNum4Test() throws NumberException {
		Set<Integer> vampireNum = VampireNum.getVampireNum(4);
		System.out.println("4位的吸血鬼数字：");
		System.out.println(vampireNum);
		System.out.println("吸血鬼数字个数：" + vampireNum.size());
	}

	/**
	 * 测试找出6位的吸血鬼数字 及 个数
	 * 
	 * @throws NumberException
	 */
	@Test
	public void vamNum6Test() throws NumberException {
		Set<Integer> vampireNum = VampireNum.getVampireNum(6);
		System.out.println("6位的吸血鬼数字：");
		System.out.println(vampireNum);
		System.out.println("吸血鬼数字个数：" + vampireNum.size());
	}

	/**
	 * 测试5位时发生的情况，会报 位数错误 异常
	 * 
	 * @throws NumberException
	 */
	@Test
	public void vamNum5Test() throws NumberException {
		VampireNum.getVampireNum(5);
	}

	/**
	 * 测试-1位时发生的情况，会报 位数错误 异常
	 * 
	 * @throws NumberException
	 */
	@Test
	public void vamNumf1Test() throws NumberException {
		VampireNum.getVampireNum(-1);
	}

}
