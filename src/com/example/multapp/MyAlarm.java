package com.example.multapp;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyAlarm extends Activity{
Button jbtnalarm;
EditText jetseconds;
@Override
protected void onCreate(Bundle savedInstanceState) {
	setContentView(R.layout.setalarm);
	super.onCreate(savedInstanceState);
	jetseconds=(EditText)findViewById(R.id.etseconds1);
	jbtnalarm=(Button)findViewById(R.id.btnalarm);
	jbtnalarm.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
		int i=Integer.parseInt(jetseconds.getText().toString());
			Intent intent=new Intent(getApplicationContext(),MyBroadcast.class);
			PendingIntent pi=PendingIntent.getBroadcast(getApplicationContext(),(int)System.currentTimeMillis(), intent, 0);
			AlarmManager mgr=(AlarmManager)getSystemService(Context.ALARM_SERVICE);
			mgr.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(i*1000),pi);
			Toast.makeText(getApplicationContext(), "Alarm Has been Set",Toast.LENGTH_LONG).show();
		}
	});
	
}


}
