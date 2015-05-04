package com.example.valuepassing_radiobutton_usingintent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity 
{
	TextView tv,tv1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		tv=(TextView)findViewById(R.id.textView1);
		tv1=(TextView)findViewById(R.id.textView2);
		Intent i=getIntent();
		String receivedvalue=i.getStringExtra("Key");
		tv.setText(receivedvalue);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
