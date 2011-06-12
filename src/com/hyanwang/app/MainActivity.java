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
 */

//TODO:two activities

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private EditText weighEditText ; //体重输入
    private EditText heightEditText; //身高输入
    private Button bmicalButton; //计算按钮
    private TextView resultTextView; //BMI结果显示
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        weighEditText=(EditText)findViewById(R.id.yourWeigh);
        heightEditText=(EditText)findViewById(R.id.yourHeight);
        resultTextView=(TextView)findViewById(R.id.resultBMI);
        bmicalButton=(Button)findViewById(R.id.calcutlatorBMI);
        bmicalButton.setOnClickListener(listener);
    }
    //TODO:计算监听器
    private OnClickListener listener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			
			float resultvalue=0;//数值初始化
			String weighvalueString = weighEditText.getText().toString();
			String heghtvalueString = heightEditText.getText().toString();
			
			
		}
	};
}