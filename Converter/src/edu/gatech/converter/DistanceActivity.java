package edu.gatech.converter;

import edu.gatech.converter.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class DistanceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_distance);
	}
	
	//static method do convert miles to feet
	public static String milesToFeet(double miles){
		double ft=miles * 5280;
		return String.valueOf(ft);
	}
	
	//static method do convert miles to inches
	public static String milesToInches(double miles){
		double in=miles * 5280 * 12;
		return String.valueOf(in);
	}
	
	//static method do convert miles to kilometers
	public static String milesToKilometers(double miles){
	
		double km = miles * 1.60934;
		return String.valueOf(km);
	}
	
	//static method do convert miles to meters
	public static String milesToMeters(double miles){
		double m=miles * 1609.34;
		return String.valueOf(m);
	}

	//static method do convert miles to millimeters
	public static String milesToMillimeters(double miles){
		double mm= miles * 1609340;
		return String.valueOf(mm);
	}

	//static method to convert feet to miles
	public static String feetToMiles(double ft){
		double miles = ft * 0.000189394;
		return String.valueOf(miles);
	}
	
	//static method to convert feet to inches
	public static String feetToInches(double ft){
		double in = ft * 12;
		return String.valueOf(in);
	}
	
	//static method to convert feet to kilometers
	public static String feetToKilometers(double ft){
		double km = ft * 0.0003048;
		return String.valueOf(km);
	}
	
	//static method to convert feet to meters
	public static String feetToMeters(double ft){
		double m = ft * 0.3048;
		return String.valueOf(m);
	}
	
	//static method to convert feet to millimeters
	public static String feetToMillimeters(double ft){
		double mm = ft * 304.8;
		return String.valueOf(mm);
	}
	
	//static method to convert inches to miles
	public static String inchesToMiles (double in){
		double miles = in * 0.0000157828;
		return String.valueOf(miles);
	}
	

	//static method to convert inches to feet
	public static String inchesToFeet (double in){
		double ft = in / 12;
		return String.valueOf(ft);
	}
	
	//static method to convert inches to kilometers
	public static String inchesToKilometers (double in){
		double km = in * 0.0000254;
		return String.valueOf(km);
	}
	
	//static method to convert inches to meters
	public static String inchesToMeters (double in){
		double m = in * 0.0254;
		return String.valueOf(m);
	}
	
	//static method to convert inches to millimeters
	public static String inchesToMillimeters (double in){
		double mm = in * 25.4;
		return String.valueOf(mm);
	}
	
	//static method to convert metric kilometers to miles
	public static String kilometersToMiles (double km){
		double miles = km * 0.621371;
		return String.valueOf(miles);
	}
	
	//static method to convert kilometers to feet
	public static String kilometersToFeet (double km){
		double ft= km * 3280.84;
		return String.valueOf(ft);
	}
	
	//static method to convert kilometers to inches
	public static String kilometersToInches (double km){
		double in= km * 39370.1;
		return String.valueOf(in);
	}
	//static method to convert kilometers to meters
	public static String kilometersToMeters (double km){
		double m= km * 1000;
		return String.valueOf(m);
	}
	
	//static method to convert kilometers to millimeters
	public static String kilometersToMillimeters (double km){
		double mm= 1000000* km;
		return String.valueOf(mm);
	}
	
	//static method to convert meters to miles
	public static String metersToMiles(double m){
		double miles = m * 0.000621371;
		return String.valueOf(miles);
	}
	
	//static method to convert meters to feet
	public static String metersToFeet(double m){
		double ft = m* 3.28084;
		return String.valueOf(ft);
	}
	
	//static method to convert meters to inches
	public static String metersToInches(double m){
		double in = m * 39.3701;
		return String.valueOf(in);
	}
	
	//static method to convert meters to kilometers
	public static String metersToKilometers(double m){
		double km = m/1000;
		return String.valueOf(km);
	}
	
	//static method to convert meters to millimeters
	public static String metersToMillimeters(double m){
		double mm = m*1000;
		return String.valueOf(mm);
	}
	
	//static method to convert millimeters to miles
	public static String millimetersToMiles(double mm){
		double miles = mm * 0.000000621371;
		return String.valueOf(miles);
	}
	
	//static method to convert millimeters to Feet
	public static String millimetersToFeet(double mm){
		double ft = mm * 0.00328084;
		return String.valueOf(ft);
	}
	
	//static method to convert millimeters to inches
	public static String millimetersToInches(double mm){
		double in = mm * 0.0393701;
		return String.valueOf(in);
	}
	
	//static method to convert millimeters to km
	public static String millimetersToKilometers(double mm){
		double km = mm / 1000000;
		return String.valueOf(km);
	}

	//static method to convert millimeters to meters
	public static String millimetersToMeters(double mm){
		double m= mm/1000;
		return String.valueOf(m);
	}

	//******** EVENT HANDLERS  *********	
	
	public void calculateDistance(View view) {

		//The following lines are used to read text from the input box
		double distance=0;
		EditText initialNumber = (EditText) findViewById(R.id.editInitialDistance);
		try{
			distance = Double.parseDouble(initialNumber.getText().toString());

		} catch (NumberFormatException ex){
			//send message
			initialNumber.setText("Enter a number");
		}
		
		//sets the variable outputText
		EditText outputText = (EditText) findViewById(R.id.textResultDistance);

		String selectionFrom = "M";
		String selectionTo = "K";

		RadioButton radioButton = (RadioButton) findViewById(R.id.radioFromMiles);
		boolean checked = radioButton.isChecked();
		if (checked==true) selectionFrom="M";
		
		checked = ((RadioButton) findViewById(R.id.radioFromFeet)).isChecked();
		if(checked==true) selectionFrom="F";
		
		checked = ((RadioButton) findViewById(R.id.radioFromInches)).isChecked();
		if(checked==true) selectionFrom="I";
		
		checked = ((RadioButton) findViewById(R.id.radioFromKilometers)).isChecked();
		if(checked==true) selectionFrom="K";
		
		checked = ((RadioButton) findViewById(R.id.radioFromMeters)).isChecked();
		if(checked==true) selectionFrom="m";
		
		checked = ((RadioButton) findViewById(R.id.radioFromMillimeters)).isChecked();
		if(checked==true) selectionFrom="mm";
		
		checked = ((RadioButton) findViewById(R.id.radioToMiles)).isChecked();
		if (checked==true) selectionTo="M";
		
		checked = ((RadioButton) findViewById(R.id.radioToFeet)).isChecked();
		if(checked==true) selectionTo="F";
		
		checked = ((RadioButton) findViewById(R.id.radioToInches)).isChecked();
		if(checked==true) selectionTo="I";
		
		checked = ((RadioButton) findViewById(R.id.radioToKilometers)).isChecked();
		if(checked==true) selectionTo="K";
		
		checked = ((RadioButton) findViewById(R.id.radioToMeters)).isChecked();
		if(checked==true) selectionTo="m";
		
		checked = ((RadioButton) findViewById(R.id.radioToMillimeters)).isChecked();
		if(checked==true) selectionTo="mm";
		
		if (selectionFrom=="M"){
			switch (selectionTo){
			case "M":
				outputText.setText(String.valueOf(distance));
				break;
			case "F":
				outputText.setText(milesToFeet(distance));
				break;
			case "I":
				outputText.setText (milesToInches(distance));
				break;
			case "K":
				outputText.setText (milesToKilometers(distance));
				break;
			case "m":
				outputText.setText(milesToMeters(distance));
				break;
			case "mm":
				outputText.setText (milesToMillimeters(distance));
			}
		}
		if (selectionFrom=="F"){
			switch (selectionTo){
			case "M":
				outputText.setText(feetToMiles(distance));
				break;
			case "F":
				outputText.setText(String.valueOf(distance));
				break;
			case "I":
				outputText.setText (feetToInches(distance));
				break;
			case "K":
				outputText.setText (feetToKilometers(distance));
				break;
			case "m":
				outputText.setText(feetToMeters(distance));
				break;
			case "mm":
				outputText.setText (feetToMillimeters(distance));
			}
		}	
		if (selectionFrom=="I"){
				switch (selectionTo){
				case "M":
					outputText.setText(inchesToMiles(distance));
					break;
				case "F":
					outputText.setText(inchesToFeet(distance));
					break;
				case "I":
					outputText.setText (String.valueOf(distance));
					break;
				case "K":
					outputText.setText (inchesToKilometers(distance));
					break;
				case "m":
					outputText.setText(inchesToMeters(distance));
					break;
				case "mm":
					outputText.setText (inchesToMillimeters(distance));
				}
		}
		if (selectionFrom=="K"){
				switch (selectionTo){
				case "M":
					outputText.setText(kilometersToMiles(distance));
					break;
				case "F":
					outputText.setText(kilometersToFeet(distance));
					break;
				case "I":
					outputText.setText (kilometersToInches(distance));
					break;
				case "K":
					outputText.setText(String.valueOf(distance));
					break;
				case "m":
					outputText.setText(kilometersToMeters(distance));
					break;
				case "mm":
					outputText.setText (kilometersToMillimeters(distance));
				}
		}

		if (selectionFrom=="m"){
				switch (selectionTo){
				case "M":
					outputText.setText(metersToMiles(distance));
					break;
				case "F":
					outputText.setText(metersToFeet(distance));
					break;
				case "I":
					outputText.setText (metersToInches(distance));
					break;
				case "K":
					outputText.setText(metersToKilometers(distance));
					break;
				case "m":
					outputText.setText(String.valueOf(distance));
					break;
				case "mm":
					outputText.setText (metersToMillimeters(distance));
				}
		}
			
		if (selectionFrom=="mm"){
				switch (selectionTo){
				case "M":
					outputText.setText(millimetersToMiles(distance));
					break;
				case "F":
					outputText.setText(millimetersToFeet(distance));
					break;
				case "I":
					outputText.setText (millimetersToInches(distance));
					break;
				case "K":
					outputText.setText(millimetersToKilometers(distance));
					break;
				case "m":
					outputText.setText(millimetersToMeters(distance));
					break;
				case "mm":
					outputText.setText (String.valueOf(distance));
				}
		}
	
	}
	
	// button press event handler to return to main menu.  
	public void goBack(View view){
		Intent intent = new Intent (this, MainActivity.class);
		startActivity(intent);
	}
	

}