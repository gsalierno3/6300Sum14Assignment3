package edu.gatech.converter;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class TemperatureActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_temperature);
	}
	
	//static method to convert farenheit to celcius
	public static String getCelcius(double farenheit){
		double celcius = 5 / 9 * (farenheit-32);
		return String.valueOf(celcius);
	}
	
	//static method to convert celcius to farenheit
	public static String getMi(double celcius){
		double farenheit = 9*celcius / 5 +32;
		return String.valueOf(farenheit);
	}

}
