package com.sunkuan;

import java.util.Scanner;

import com.sunkuan.entity.Rover;
import com.sunkuan.util.CheckUtil;
import com.sunkuan.util.DirecEnum;

public class CosmosMain {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ƽ̨���Ͻǵ����꣨�Կո�ָ���");
		int maxX = sc.nextInt();
		int maxY = sc.nextInt();
		
		// ����ƽ̨���½����꣬Ĭ��(0,0)
		int minX = 0;
		int minY = 0;
		
		// �����һ�������ߵ�����ͺ���
		System.out.println("�������һ�������ߵ�����ͺ����Կո�ָ���");
		int roverX = sc.nextInt();
		int roverY = sc.nextInt();
		String roverDirec = sc.next();
		// У��������������Ч��
		CheckUtil.check(minX, minY, maxX, maxY, roverX, roverY, roverDirec);
		Rover rover1 = new Rover(roverX, roverY, DirecEnum.valueOf(roverDirec));
		// �����һ�������ߵ�ָ��
		System.out.println("�������һ�������ߵĲ���ָ��");
		String order = sc.next();
		// У��ָ��������Ч��
		CheckUtil.check(order);
		// ִ��ָ����������꼰����
		rover1.execute(order);
		
		// ����ڶ��������ߵ�����ͺ���
		System.out.println("������ڶ��������ߵ�����ͺ����Կո�ָ���");
		roverX = sc.nextInt();
		roverY = sc.nextInt();
		roverDirec = sc.next();
		// У��������������Ч��
		CheckUtil.check(minX, minY, maxX, maxY, roverX, roverY, roverDirec);
		Rover rover2 = new Rover(roverX, roverY, DirecEnum.valueOf(roverDirec));
		// ����ڶ��������ߵ�ָ��
		System.out.println("������ڶ��������ߵĲ���ָ��");
		order = sc.next();
		// У��ָ��������Ч��
		CheckUtil.check(order);
		// ִ��ָ����������꼰����
		rover2.execute(order);

		System.out.println("��һ�������ߵ��������꼰����");
		System.out.println(rover1);
		System.out.println("�ڶ��������ߵ��������꼰����");
		System.out.println(rover2);
		
		sc.close();
		
	}

}
