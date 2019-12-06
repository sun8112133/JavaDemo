package com.sunkuan;

import java.util.Scanner;

import com.sunkuan.entity.Rover;
import com.sunkuan.util.CheckUtil;
import com.sunkuan.util.DirecEnum;

public class CosmosMain {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入平台右上角的坐标（以空格分隔）");
		int maxX = sc.nextInt();
		int maxY = sc.nextInt();
		
		// 设置平台左下角坐标，默认(0,0)
		int minX = 0;
		int minY = 0;
		
		// 输入第一个漫游者的坐标和航向
		System.out.println("请输入第一个漫游者的坐标和航向（以空格分隔）");
		int roverX = sc.nextInt();
		int roverY = sc.nextInt();
		String roverDirec = sc.next();
		// 校验漫游者数据有效性
		CheckUtil.check(minX, minY, maxX, maxY, roverX, roverY, roverDirec);
		Rover rover1 = new Rover(roverX, roverY, DirecEnum.valueOf(roverDirec));
		// 输入第一个漫游者的指令
		System.out.println("请输入第一个漫游者的操作指令");
		String order = sc.next();
		// 校验指令数据有效性
		CheckUtil.check(order);
		// 执行指令，并更新坐标及航向
		rover1.execute(order);
		
		// 输入第二个漫游者的坐标和航向
		System.out.println("请输入第二个漫游者的坐标和航向（以空格分隔）");
		roverX = sc.nextInt();
		roverY = sc.nextInt();
		roverDirec = sc.next();
		// 校验漫游者数据有效性
		CheckUtil.check(minX, minY, maxX, maxY, roverX, roverY, roverDirec);
		Rover rover2 = new Rover(roverX, roverY, DirecEnum.valueOf(roverDirec));
		// 输入第二个漫游者的指令
		System.out.println("请输入第二个漫游者的操作指令");
		order = sc.next();
		// 校验指令数据有效性
		CheckUtil.check(order);
		// 执行指令，并更新坐标及航向
		rover2.execute(order);

		System.out.println("第一个漫游者的最终坐标及航向：");
		System.out.println(rover1);
		System.out.println("第二个漫游者的最终坐标及航向：");
		System.out.println(rover2);
		
		sc.close();
		
	}

}
