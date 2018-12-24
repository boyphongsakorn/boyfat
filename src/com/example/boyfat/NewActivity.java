package com.example.boyfat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
 
public class NewActivity extends Activity {
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from new_activity.xml
		setContentView(R.layout.new_activity);
	}
	
	public void onButtonClick(View v){
	    EditText eT1 = (EditText)findViewById(R.id.editText1);
	    EditText eT2 = (EditText)findViewById(R.id.editText2);
	    TextView rest = (TextView)findViewById(R.id.textView3);
	    
	    int num1 = Integer.parseInt(eT1.getText().toString());
	    int num2 = Integer.parseInt(eT2.getText().toString());
	    
	    double cmtom = num2/100;
	    
	    double sum = num1 / (cmtom*cmtom);
	    
	    if(sum>30){
	    	rest.setText("ÍéÇ¹ÁÒ¡");
	    } else if (sum>=25 && sum<=29.9) {
	    	rest.setText("ÍéÇ¹");
	    } else if (sum>=23 && sum<=24.9) {
	    	rest.setText("¹éÓË¹Ñ¡à¡Ô¹");
	    } else if (sum>=18.6 && sum<=22.9) {
	    	rest.setText("¹éÓË¹Ñ¡»¡µÔ àËÁÒĞÊÁ");
	    } else {
	    	rest.setText("¼ÍÁà¡Ô¹ä»");
	    }
	    
	    }
}
