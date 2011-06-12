package com.hyanwang.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * PROJECT NAME: bmiCalculator
 * 
 * @version Jun 12, 2011 5:12:44 PM
 * 
 * 
 * @author kut@an gmail: robinwong51@gmail.com blog:
 *         http://kutanworld.tumblr.com/
 * @date Jun 12, 2011
 * 
 * @comment:
 * 
 */

public class ResultActivity extends Activity {
	private TextView resultBmTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);

		CalculatorClass calculator = new CalculatorClass();
		Bundle bundle = this.getIntent().getExtras();

		float weigh = bundle.getFloat("weighvalue");
		float height = bundle.getFloat("heightvalue");

		resultBmTextView = (TextView) findViewById(R.id.ResultBMI);
		String resultBmiValue=calculator.bmiCal(weigh, height);
		resultBmTextView.setText("你的BMI值为"+resultBmiValue);

	}

}
