package com.example.multapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
MediaPlayer mp;
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCreate() {
		mp=MediaPlayer.create(getApplicationContext(), R.raw.omfg);
		Toast.makeText(getApplicationContext(), "Service has been created",Toast.LENGTH_LONG).show();
		
		super.onCreate();
	}

	@Override
	public void onDestroy() {
		mp.stop();
		Toast.makeText(getApplicationContext(), "Service has been Destroyed",Toast.LENGTH_LONG).show();
		
		super.onDestroy();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		mp.start();
		Toast.makeText(getApplicationContext(), "Service has been Started",Toast.LENGTH_LONG).show();
		
		return super.onStartCommand(intent, flags, startId);
	}

}
