package com.rizki.kosankuu;

import android.R.menu;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

	private static int splash = 3000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		new android.os.Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent show = new Intent(Splash.this,Menu.class);
				startActivity(show);
				finish();
			}
		},splash);
	}
}
