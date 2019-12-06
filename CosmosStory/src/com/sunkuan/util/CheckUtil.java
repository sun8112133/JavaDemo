package com.sunkuan.util;

/**
 * 校验数据有效性
 * @author SunKuan
 * @create 2019-12-5
 * @since 1.1
 *
 */
public class CheckUtil {

	/**
	 * 校验漫游者数据有效性
	 * @param minX 平台右下角 x
	 * @param minY 平台右下角 y
	 * @param maxX 平台左上角 x
	 * @param maxY 平台左上角 y
	 * @param roverX 漫游者 x
	 * @param roverY 漫游者 y
	 * @param roverDirec 漫游者航向
	 * @throws InfoException 漫游者数据异常
	 */
	public static void check(int minX, int minY, int maxX, int maxY, 
			int roverX, int roverY, String roverDirec) throws InfoException {
		// 校验坐标
		if (roverX < minX || roverX > maxX || roverY < minY || roverY > maxY) {
			throw new InfoException("您输入的漫游者数据有误！");
		}
		// 校验航向
		if (!roverDirec.matches("[NWSE]*")) {
			throw new InfoException("您输入的航向有误！");
		}
	}

	/**
	 * 校验指令数据有效性
	 * @param order 指令
	 * @throws OrderException 指令异常
	 */
	public static void check(String order) throws OrderException {
		if (!order.matches("[LRM]*")) {
			throw new OrderException("您输入的指令有误！");
		}
	}

}
