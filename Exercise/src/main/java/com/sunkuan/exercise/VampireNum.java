package com.sunkuan.exercise;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import com.sunkuan.util.NumberException;

/**
 * Vampire Number
 * @author Sunkuan
 * @create 2019-12-6
 * @since 1.0
 *
 */
public class VampireNum {

	/**
	 * 获取指定位数的吸血鬼数
	 * @param num 位数
	 * @return 吸血鬼数
	 * @throws NumberException 
	 */
	 public static Set<Integer> getVampireNum(int num) throws NumberException {
		 // 校验位数是否正确
		 if (num < 4 || num % 2 != 0) {
			 throw new NumberException("位数错误");
		 }
		 
		 Set<Integer> vamNums = new TreeSet<>();  // 存放吸血鬼数的集合
		 
		 int minNum = (int) Math.pow(10, num/2-1);  // 乘数的最小值
		 int maxNum = (int) Math.pow(10, num/2);  // 乘数的最大值 
		 int minVamNum = (int) Math.pow(10, num-1);  // 吸血鬼数范围的最小值
		 int maxVamNum = (int) Math.pow(10, num);  // 吸血鬼数范围的最大值
		 
		 // 寻找吸血鬼数，num1代表第1个乘数，num2代表第2个乘数
		 for (int num1 = minNum; num1 < maxNum; num1 ++) {
			 for (int num2 = num1 + 1; num2 < maxNum; num2 ++) {
				 int vamNum = num1 * num2;
				 // 积小于1000或大于9999排除,继续下一轮环
				 if (vamNum < minVamNum || vamNum > maxVamNum) {
					 continue;
				 }
				 // 乘积
				 String[] vamNumStr = String.valueOf(vamNum).split("");
				 // 数字
				 String[] numStr = (String.valueOf(num1) + String.valueOf(num2)).split("");
				 Arrays.sort(vamNumStr);
				 Arrays.sort(numStr);
				 // 排序后比较，为true的就是吸血鬼数
				 if (Arrays.equals(vamNumStr, numStr)) {
					 vamNums.add(new Integer(num1 * num2));
				 }
			 }
		 }
		 
		 return vamNums;
	 }
	
}
