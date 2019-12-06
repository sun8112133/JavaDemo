package com.sunkuan.test;

import org.junit.Test;

import com.sunkuan.entity.Rover;
import com.sunkuan.util.DirecEnum;

/**
 * 移动测试
 * 
 * @author SunKuan
 * @create 2019-12-5
 * @since 1.1
 *
 */
public class RoverMoveTest {

	/**
	 * 向前移动一步
	 */
	@Test
	public void moveTest() {
		Rover rover = new Rover(0, 0, DirecEnum.N);
		System.out.println(rover);
		String order = "M";
		rover.execute(order);
		System.out.println(rover);
	}
	
}
