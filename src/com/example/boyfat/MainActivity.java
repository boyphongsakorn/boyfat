package com.example.boyfat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
	Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button = (Button) findViewById(R.id.MyButton);
        
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
 
				Intent myIntent = new Intent(MainActivity.this,
						NewActivity.class);
				startActivity(myIntent);
			}
		});

    }
}
