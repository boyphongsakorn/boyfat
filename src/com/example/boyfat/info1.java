package com.example.boyfat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class info1 extends Activity {
	Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info1);
        
        button = (Button) findViewById(R.id.button1);
        
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
 
				Intent myIntent = new Intent(info1.this,
						info2.class);
				startActivity(myIntent);
			}
		});

    }
}
