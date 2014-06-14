package edu.gatech.converter;

//import android.R;
import android.app.Activity;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import edu.gatech.converter.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		setContentView(R.layout.activity_list_item);
	}
	
	public void distance(View view){
		//call Distance_Activity
		Intent intent = new Intent (this, DistanceActivity.class);
		startActivity(intent);
	}
	public void temperature(View view){
		// call Temperature_Activity
		Intent intent = new Intent (this, TemperatureActivity.class);
		startActivity(intent);
	}
	public void weight(View view){
		//call Weight_Activity
		Intent intent = new Intent (this, WeightActivity.class);
		startActivity(intent);
	}
}
