package com.Fenyuk.CalculationPayment;

import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	Button WaterButton;
	Button GasButton;
	Button RubbishButton;
    Button ElectricityButton;
    Button PhoneButton;
    TextView tvOut;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WaterButton=(Button) findViewById(R.id.WaterButton);
		GasButton=(Button) findViewById(R.id.GasButton);
		RubbishButton=(Button) findViewById(R.id.RubbishButton);
	    ElectricityButton=(Button) findViewById(R.id.ElectricityButton);
	    PhoneButton=(Button) findViewById(R.id.PhoneButton);
	    
		WaterButton.setOnClickListener( this);
		GasButton.setOnClickListener( this);
		RubbishButton.setOnClickListener( this);
	    ElectricityButton.setOnClickListener( this);
	    PhoneButton.setOnClickListener( this);
	    
	    tvOut = (TextView) findViewById(R.id.tvOut);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	static final Map<Integer, Class<?>> dictClassByID = new HashMap<Integer , Class<?>>() 
			{
	{
	    put(R.id.WaterButton,   WaterLayoutActivity.class);
	    put(R.id.GasButton,     GasLayoutActivity.class);
	    put(R.id.RubbishButton, RubbishLayoutActivity.class);
	    put(R.id.ElectricityButton,ElectricityLayoutActivity.class);
	    put(R.id.PhoneButton,   PhoneLayoutActivity.class);
	}};	
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	     // по id определеяем кнопку, вызвавшую этот обработчик
		/*Class<?> classActivity = null;
	     switch (v.getId()) {
	     case R.id.WaterButton:
	       classActivity=WaterLayoutActivity.class;
	       break;
	     case R.id.GasButton:
		   tvOut.setText("GasButton");
		   break;
	     case R.id.RubbishButton:
		   tvOut.setText("RubbishButton");
		   break;
	     case R.id.ElectricityButton:
		   tvOut.setText("ElectricityButton");
		   break;
	     case R.id.PhoneButton:
		   tvOut.setText("PhoneButton");
		   break;
	     }*/
		Class<?> curClass=dictClassByID.get(v.getId());
  		Intent intent = new Intent(this, curClass);
    	intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);// clear back stack
         startActivity(intent);
         tvOut.setText(curClass.getName());
         finish();
	   }

}
