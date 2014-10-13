package com.jude.jpagerviewexample;


import com.jude.view.jpagerview.JPagerAdapter;
import com.jude.view.jpagerview.JPagerView;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;

public class MainActivity extends ActionBarActivity {

	private JPagerView jpv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		jpv = (JPagerView) findViewById(R.id.jpv);

		
		jpv.setAdapter(new JPagerAdapter(){
			private final int imgs[] = {
					R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e
			};
			@Override
			public View getView(ViewGroup container, int position) {

				ImageView img = new ImageView(MainActivity.this);
				img.setImageResource(imgs[position]);
				img.setScaleType(ScaleType.FIT_CENTER);
				img.setLayoutParams(new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
				return img;
			}

			@Override
			public int getCount() {
				return imgs.length;
			}

		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
