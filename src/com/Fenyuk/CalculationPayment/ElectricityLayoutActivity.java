package com.Fenyuk.CalculationPayment;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;

public class ElectricityLayoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.electricity_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.electricity_layout, menu);
		return true;
	}

    public void onClickReturn(View v) 
    {
    	onBackPressed();
		/*Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();*/
        //can just call onBackPressed() instead of use Intent to go back to MainActivity.. 
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) 
    {
    	if (keyCode == KeyEvent.KEYCODE_BACK) 
    	{
    		onBackPressed();
    	}
    	return super.onKeyDown(keyCode, event);
   }

    public void onBackPressed() 
    {
    	Intent myIntent = new Intent(this, MainActivity.class);
    	myIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);// clear back stack
    	startActivity(myIntent);
    	finish();
    	return;
   }  
}
