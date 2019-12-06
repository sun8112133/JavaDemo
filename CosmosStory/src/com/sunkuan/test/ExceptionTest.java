package com.sunkuan.test;

import org.junit.Test;

import com.sunkuan.util.CheckUtil;
import com.sunkuan.util.InfoException;
import com.sunkuan.util.OrderException;

/**
 * 异常测试
 * 
 * @author SunKuan
 * @create 2019-12-5
 * @since 1.1
 *
 */
public class ExceptionTest {

	/**
	 * 漫游者数据异常测试
	 */
	@Test
	public void infoExceptionTest1() {
		int maxX = 5;
		int maxY = 5;
		int minX = 0;
		int minY = 0;
		int roverX = 10;
//		int roverY = 20;
//		int roverX = 1;
		int roverY = 2;
		String roverDirec = "N";
		try {
			CheckUtil.check(minX, minY, maxX, maxY, roverX, roverY, roverDirec);
		} catch (InfoException e) {
			e.printStackTrace();
			return;
		}
		System.out.println("数据正确");
	}
	
	/**
	 * 指令异常测试
	 */
	@Test
	public void orderExceptionTest() {
//		String order = "LIRE";
//		String order = "RMLRL";
		String order = "RMI";
		try {
			CheckUtil.check(order);
		} catch (OrderException e) {
			e.printStackTrace();
			return;
		}
		System.out.println("数据正确");
	}
	
}
