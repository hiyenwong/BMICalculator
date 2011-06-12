package com.hyanwang.app;

/**
 * PROJECT NAME: bmiCalculator
 * @version Jun 12, 2011 1:53:40 PM
 * 
 *
 * @author kut@an
 *         Email: robinwong51@gmail.com     
 *         blog: http://kutanworld.tumblr.com/
 * @date Jun 12, 2011
 * 
 * about BMI
 *  
 * 体重指数(BMI)=体重根据世界卫生组织定下的标准，亚洲人的BMI（体重指标BodyMassIndex)若高于22.9便属于过重。
 * 亚洲人和欧美人属于不同人种，WHO的标准不是非常适合中国人的情况，为此制定了中国参考标准：
 */

//TODO:two activities

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText weighEditText; // 体重输入
	private EditText heightEditText; // 身高输入
	private Button bmicalButton; // 计算按钮

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bmicalButton = (Button) findViewById(R.id.calcutlatorBMI);
		bmicalButton.setOnClickListener(listener);
	}

	// TODO:计算监听器
	private OnClickListener listener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			weighEditText = (EditText) findViewById(R.id.yourWeigh);
			heightEditText = (EditText) findViewById(R.id.yourHeight);
			
			// 抓取身高和体重的数值
			Bundle bundle = new Bundle();
			bundle.putFloat("weighvalue", Float.parseFloat(weighEditText
					.getText().toString()));
			bundle.putFloat("heightvalue", Float.parseFloat(heightEditText
					.getText().toString()));

			// 创建Intent对象，进行两个Activity关联
			Intent intent = new Intent(MainActivity.this, ResultActivity.class);
			intent.putExtras(bundle);
			startActivity(intent);
		}
	};
}