package com.rizki.kosankuu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Index extends Activity {

	ImageView kosan, kosan1, kosan2, kosan3, kosan4, kosan5, kosan6, kosan7, kosan8, kosan9, kosan10;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_index);
		kosan4=(ImageView) findViewById(R.id.kedetail4);
		kosan4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent all=new Intent(getApplicationContext(), Detail4.class);
			startActivity(all);
			}
		});
		
		kosan3=(ImageView) findViewById(R.id.kedetail3);
		kosan3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Intent all=new Intent(getApplicationContext(), Detail3.class);	
			startActivity(all);
			}
		});
		
		kosan2=(ImageView) findViewById(R.id.kedetail2);
		kosan2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent all=new Intent(getApplicationContext(), Detail2.class);
				startActivity(all);
			}
		});
		
		kosan1=(ImageView) findViewById(R.id.kedetail1);
		kosan1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent all=new Intent(getApplicationContext(), Detail1.class);
				startActivity(all);	
			}
		});
		
		
		kosan=(ImageView) findViewById(R.id.kedetail);
		kosan.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent all=new Intent(getApplicationContext(), Detail.class);
				startActivity(all);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.index, menu);
		return true;
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
