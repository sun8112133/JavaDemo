package com.sunkuan.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 方位
 * 
 * @author SunKuan
 * @create 2019-12-5
 * @since 1.1
 *
 */
public enum DirecEnum {
	N(0, "北"), W(1, "西"), S(2, "南"), E(3, "东");

	private int id; // 编号
	private String name; // 名称

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
