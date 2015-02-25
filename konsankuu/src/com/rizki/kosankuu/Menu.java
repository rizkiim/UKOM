package com.rizki.kosankuu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity {
	Button btnPengertian, btnLihat, btnTentang;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		btnPengertian = (Button) findViewById(R.id.button1);
		btnLihat = (Button) findViewById(R.id.button2);
		btnTentang = (Button) findViewById(R.id.button3);
		
		btnPengertian.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Menu.this, Pengertian.class);
				startActivity(i);
			}
		});
		btnLihat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent n = new Intent(Menu.this, Index.class);
				startActivity(n);
			}
		});
		btnTentang.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent m = new Intent(Menu.this, Tentang.class);
				startActivity(m);	
			}
		});
	}	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}
