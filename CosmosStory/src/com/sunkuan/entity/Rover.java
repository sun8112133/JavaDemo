package com.sunkuan.entity;

import com.sunkuan.util.DirecEnum;

/**
 * ������
 * 
 * @author SunKuan
 * @create 2019-12-5
 * @since 1.1
 */
public class Rover {

	private int x; // x����
	private int y; // y����
	private DirecEnum direc; // ����

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
	 * ��ǰ�ƶ�1��
	 */
	public void move() {
		// �ƶ�λ��
		switch (this.direc.getId()) {
			case 0:  // ��
				this.y ++;
				break;
			case 1:  // ��
				this.x --;
				break;
			case 2:  // ��
				this.y --;
				break;
			case 3:  // ��
				this.x ++;
				break;
		}
	}
	
	// ��ת90��
	/**
	 * ��ת90��
	 * @param c ��������ָ��
	 */
	public void spin(char c) {
		// ��ȡ��ǰ����ı��
		int id = this.direc.getId(); 
		// ���ĺ��� ���
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
		
		// ���µ�ǰ����
		this.direc = direc;
	}

	/**
	 * ִ��ָ��
	 * @param order
	 */
	public void execute(String order) {
		// ����ָ��
		for (int i = 0; i < order.length(); i++) {
			char c = order.charAt(i);   // ��ȡÿһ��ָ��
			// ����
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
