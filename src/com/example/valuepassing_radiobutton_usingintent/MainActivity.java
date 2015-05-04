package com.example.valuepassing_radiobutton_usingintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;

public class MainActivity extends Activity
{
	RadioButton r1,r2;
	Button bt;
	String a,b,s1="";

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		r1=(RadioButton)findViewById(R.id.radioButton1);
		r2=(RadioButton)findViewById(R.id.radioButton2);
		
		bt=(Button)findViewById(R.id.button1);
		
		bt.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,SecondActivity.class);
				
				i.putExtra("Key",s1);
				
				startActivity(i);
				
			}
		});
		
		r1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) 
			{
				// TODO Auto-generated method stub
				if(arg1==true)
				{
					r2.setChecked(false);
					a=r1.getText().toString();
					s1=a;
					
				}
				else
				{
					s1=s1.replace(a,"");
				}
			}
		});
		
		r2.setOnCheckedChangeListener(new OnCheckedChangeListener() 
		{
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) 
			{
				// TODO Auto-generated method stub
				if(arg1==true)
				{
					r1.setChecked(false);
					b=r2.getText().toString();
					s1=b;
				}
				else
				{
					s1=s1.replace(b,"");
				}
				
			}
		});
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
