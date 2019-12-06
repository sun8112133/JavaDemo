package com.sunkuan.util;

/**
 * У��������Ч��
 * @author SunKuan
 * @create 2019-12-5
 * @since 1.1
 *
 */
public class CheckUtil {

	/**
	 * У��������������Ч��
	 * @param minX ƽ̨���½� x
	 * @param minY ƽ̨���½� y
	 * @param maxX ƽ̨���Ͻ� x
	 * @param maxY ƽ̨���Ͻ� y
	 * @param roverX ������ x
	 * @param roverY ������ y
	 * @param roverDirec �����ߺ���
	 * @throws InfoException �����������쳣
	 */
	public static void check(int minX, int minY, int maxX, int maxY, 
			int roverX, int roverY, String roverDirec) throws InfoException {
		// У������
		if (roverX < minX || roverX > maxX || roverY < minY || roverY > maxY) {
			throw new InfoException("���������������������");
		}
		// У�麽��
		if (!roverDirec.matches("[NWSE]*")) {
			throw new InfoException("������ĺ�������");
		}
	}

	/**
	 * У��ָ��������Ч��
	 * @param order ָ��
	 * @throws OrderException ָ���쳣
	 */
	public static void check(String order) throws OrderException {
		if (!order.matches("[LRM]*")) {
			throw new OrderException("�������ָ������");
		}
	}

}
