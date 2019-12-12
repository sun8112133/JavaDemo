package com.zeroten.common.util;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



/**
 * 数据验证工具测试类
 * @author SunKuan
 *
 */
public class CheckUtilsTest {

	@Test
	public void isAnyEmptyTest() {
		Assert.assertEquals(CheckUtils.isAnyEmpty(null), false);
		Assert.assertEquals(CheckUtils.isAnyEmpty(new String[10]), false);
		Assert.assertEquals(CheckUtils.isAnyEmpty(new String[]{"abc", null, "def"}), false);
		Assert.assertEquals(CheckUtils.isAnyEmpty(new String[]{"abc", "123", "def"}), true);
		Assert.assertEquals(CheckUtils.isAnyEmpty(new String[]{"abc", "123", "   "}), false);
		Assert.assertEquals(CheckUtils.isAnyEmpty(new String[]{"", "123", "sss"}), false);
	}
	
	@Test
	public void isEmptyTest() {
		Assert.assertEquals(CheckUtils.isEmpty(null), true);
		Assert.assertEquals(CheckUtils.isEmpty(new String[10]), true);
		Assert.assertEquals(CheckUtils.isEmpty(new String[0]), true);
		Assert.assertEquals(CheckUtils.isEmpty(new Object[]{""}), true);
		Assert.assertEquals(CheckUtils.isEmpty(new Object[]{1, "", 123}), false);
		Assert.assertEquals(CheckUtils.isEmpty(new Object[]{1, " ", 123}), false);
		Assert.assertEquals(CheckUtils.isEmpty(new Object[]{1, " 23 ", 123}), false);
		Assert.assertEquals(CheckUtils.isEmpty(new Object[]{"", "", ""}), true);
	}
	
	@Test
	public void equalsStrTest() {
		Assert.assertEquals(CheckUtils.equals(null, "111"), false);
		Assert.assertEquals(CheckUtils.equals("123", null), false);
		Assert.assertEquals(CheckUtils.equals("123", "123"), true);
		Assert.assertEquals(CheckUtils.equals("123", "222"), false);
	}
	
	@Test
	public void equalsIntTest() {
		Assert.assertEquals(CheckUtils.equals(111, 222), false);
		Assert.assertEquals(CheckUtils.equals(null, 222), false);
		Assert.assertEquals(CheckUtils.equals(11, null), false);
		Assert.assertEquals(CheckUtils.equals(11, 11), true);
	}
	
}
