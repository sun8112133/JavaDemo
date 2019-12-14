package com.zeroten.common.util;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * 数据验证工具测试类
 * @author SunKuan
 *
 */
public class ArrayUtilsTest {

	@Test
	public void sortTest() {
		Assert.assertEquals(ArrayUtils.sort(null), null);
		Assert.assertEquals(Arrays.toString(ArrayUtils.sort(new int[]{1,2,3,4})), Arrays.toString(new int[] {1,2,3,4}));
		Assert.assertEquals(Arrays.toString(ArrayUtils.sort(new int[]{32,1,54,2})), Arrays.toString(new int[] {1,2,32,54}));
		Assert.assertEquals(Arrays.toString(ArrayUtils.sort(new int[5])), Arrays.toString(new int[5]));
		Assert.assertEquals(ArrayUtils.sort(new int[0]), null);
		
	}
	
}
