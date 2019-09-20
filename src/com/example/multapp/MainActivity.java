package com.example.multapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button jbtnstart,jbtnstop,jbtnbroadcast,jbtnnotific;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jbtnstart=(Button)findViewById(R.id.btnstart);
        jbtnstop=(Button)findViewById(R.id.btnstop);
        jbtnbroadcast=(Button)findViewById(R.id.btnbroadcast);
        jbtnnotific=(Button)findViewById(R.id.btnnotific);
        
        jbtnstart.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent i=new Intent(MainActivity.this,MyService.class);
				startService(i);
				
			}
		});
        
       jbtnstop.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent i=new Intent(MainActivity.this,MyService.class);
			stopService(i);
			
		}
	});
       jbtnbroadcast.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent i=new Intent(MainActivity.this,MyAlarm.class);
			startActivity(i);
			
		}
	});
       jbtnnotific.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
		}
	});
    }


    
}
