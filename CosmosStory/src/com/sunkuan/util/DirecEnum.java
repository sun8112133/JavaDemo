package com.sunkuan.util;

import java.util.HashMap;
import java.util.Map;

/**
 * ��λ
 * 
 * @author SunKuan
 * @create 2019-12-5
 * @since 1.1
 *
 */
public enum DirecEnum {
	N(0, "��"), W(1, "��"), S(2, "��"), E(3, "��");

	private int id; // ���
	private String name; // ����

	private DirecEnum(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	static Map<Integer, DirecEnum> _cache = new HashMap<Integer, DirecEnum>();
	
	static {
		for (DirecEnum de : DirecEnum.values()) {
			_cache.put(de.id, de);
		}
	}
	
	public static DirecEnum of(Integer id) {
		return _cache.get(id);
	}

}
