package com.sunkuan.test;

import org.junit.Test;

import com.sunkuan.entity.Rover;
import com.sunkuan.util.DirecEnum;

/**
 * ��ת����
 * 
 * @author SunKuan
 * @create 2019-12-5
 * @since 1.1
 *
 */
public class RoverSpinTest {

	/**
	 * ����ת����
	 */
	@Test
	public void leftSpinTest() {
		Rover rover = new Rover(0, 0, DirecEnum.E);
		System.out.println(rover);
		String order = "LL";
		rover.execute(order);
		System.out.println(rover);
	}
	
	/**
	 * ����ת����
	 */
	@Test
	public void rightSpinTest() {
		Rover rover = new Rover(0, 0, DirecEnum.E);
		System.out.println(rover);
		String order = "R";
		rover.execute(order);
		System.out.println(rover);
	}
	
	/**
	 * ��ת���ƶ�����
	 */
	@Test
	public void moveSpinTest() {
		Rover rover = new Rover(0, 0, DirecEnum.E);
		System.out.println(rover);
		String order = "LMM";
		rover.execute(order);
		System.out.println(rover);
	}
	
}
