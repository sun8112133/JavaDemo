package com.sunkuan.entity;

import com.sunkuan.util.DirecEnum;

/**
 * 漫游者
 * 
 * @author SunKuan
 * @create 2019-12-5
 * @since 1.1
 */
public class Rover {

	private int x; // x坐标
	private int y; // y坐标
	private DirecEnum direc; // 航向

	public Rover(int x, int y, DirecEnum direc) {
		super();
		this.x = x;
		this.y = y;
		this.direc = direc;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public DirecEnum getDirec() {
		return direc;
	}

	public void setDirec(DirecEnum direc) {
		this.direc = direc;
	}

	@Override
	public String toString() {
		return x + " " + y + " " + direc;
	}
	
	/**
	 * 向前移动1步
	 */
	public void move() {
		// 移动位置
		switch (this.direc.getId()) {
			case 0:  // 北
				this.y ++;
				break;
			case 1:  // 西
				this.x --;
				break;
			case 2:  // 南
				this.y --;
				break;
			case 3:  // 东
				this.x ++;
				break;
		}
	}
	
	// 旋转90度
	/**
	 * 旋转90度
	 * @param c 向左向右指令
	 */
	public void spin(char c) {
		// 获取当前航向的编号
		int id = this.direc.getId(); 
		// 更改航向 编号
		if (c == 'L') {
			id = id + 1;
			if (id > 3) {
				id = 0;
			}
		} else {
			id = id - 1;
			if (id < 0) {
				id = 3;
			}
		}
		DirecEnum direc = DirecEnum.of(id);
		
		// 更新当前航向
		this.direc = direc;
	}

	/**
	 * 执行指令
	 * @param order
	 */
	public void execute(String order) {
		// 解析指令
		for (int i = 0; i < order.length(); i++) {
			char c = order.charAt(i);   // 获取每一个指令
			// 解析
			switch (c) {
				case 'L':
					spin(c);
					break;
				case 'R':
					spin(c);
					break;
				case 'M':
					move();
					break;
			}
		}
	}
}
