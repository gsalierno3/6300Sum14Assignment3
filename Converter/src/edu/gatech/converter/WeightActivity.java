package edu.gatech.converter;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class WeightActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weight);
	}
	
	//static method to convert pounds to kilograms
	public static String getKm(double lb){
		double kg = lb /2.2046;
		return String.valueOf(kg);
	}
	
	//static method to convert kilograms to pounds
	public static String getMi(double kg){
		double lb = kg * 2.2046;
		return String.valueOf(lb);
	}

}
