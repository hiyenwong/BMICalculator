package com.hyanwang.app;

/**
 * PROJECT NAME: bmiCalculator
 * @version Jun 12, 2011 4:16:31 PM
 * 
 *
 * @author kut@an
 *         gmail: robinwong51@gmail.com     
 *         blog: http://kutanworld.tumblr.com/
 * @date Jun 12, 2011
 * 
 * @comment:计算方法接口,其中实现多个计算健康值的公式
 *
 */

/*
 * The Interface is about Calculator
*/

public interface Calculator_Interface {
	//计算BMI值
	String bmiCal(float weighvalue,float heightvalue); 
}
