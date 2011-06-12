package com.hyanwang.app;

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

public class CalculatorClass implements Calculator_Interface {

	@Override
	//bmi计算方法
	public int bmiCal(float weighvalue, float heightvalue) { 
		int resultBMI;
		resultBMI = (int) (weighvalue / Math.pow(heightvalue, 2));
		return resultBMI;
	}

}
