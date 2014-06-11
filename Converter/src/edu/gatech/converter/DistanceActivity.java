package edu.gatech.converter;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DistanceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_distance);
	}

	//static method to convert miles to kilometers
	public static String getKm(double miles){
		double km = miles * 1.609;
		return String.valueOf(km);
	}
	
	//static method to convert kilometers to miles
	public static String getMi(double km){
		double miles = km / 1.609;
		return String.valueOf(miles);
	}
	
}
