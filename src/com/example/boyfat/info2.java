package com.example.boyfat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class info2 extends Activity {
	Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info2);
        
        button = (Button) findViewById(R.id.button1);
        
		button.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
 
				Intent myIntent = new Intent(info2.this,
						info3.class);
				startActivity(myIntent);
			}
		});

    }
}
