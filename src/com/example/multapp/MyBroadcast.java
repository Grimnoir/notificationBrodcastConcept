package com.example.multapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

public class MyBroadcast extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		Toast.makeText(arg0, "Alarm ", Toast.LENGTH_LONG).show();
		Vibrator vib=(Vibrator)arg0.getSystemService(Context.VIBRATOR_SERVICE);
		vib.vibrate(2000);
		
	}

}
