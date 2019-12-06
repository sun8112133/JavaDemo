package com.sunkuan.test;

import org.junit.Test;

import com.sunkuan.entity.Rover;
import com.sunkuan.util.DirecEnum;

/**
 * Ğı×ª²âÊÔ
 * 
 * @author SunKuan
 * @create 2019-12-5
 * @since 1.1
 *
 */
public class RoverSpinTest {

	/**
	 * ×óĞı×ª²âÊÔ
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
	 * ÓÒĞı×ª²âÊÔ
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
	 * Ğı×ª²¢ÒÆ¶¯²âÊÔ
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
