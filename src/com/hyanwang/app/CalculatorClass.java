package com.hyanwang.app;

import java.math.BigDecimal;

/**
 * PROJECT NAME: bmiCalculator
 * 
 * @version Jun 12, 2011 4:39:59 PM
 * 
 * 
 * @author kut@an gmail: robinwong51@gmail.com blog:
 *         http://kutanworld.tumblr.com/
 * @date Jun 12, 2011
 * 
 * @comment:
 * 
 */

/*
 * the Calculator Class
 */

public class CalculatorClass implements Calculator_Interface {

	@Override
	/* BMI计算方法，返回一个String值 */
	public String bmiCal(float weighvalue, float heightvalue) {
		// 体重指数bmi=体重/身高的平方（国际单位kg/㎡）
		BigDecimal bigDecimal = new BigDecimal(weighvalue
				/ Math.pow(heightvalue, 2));
		return String.valueOf(bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP));
		// TODO:抛出如果身高为0的可能

	}

}
