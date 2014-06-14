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

public class TemperatureActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_temperature);
	}
	
	//static method to convert fahrenheit to celcius
	public static String fahrenheitToCelsius(double fahrenheit){
		double celsius = 5.0 * (fahrenheit-32) / 9;
		return String.valueOf(celsius);
	}
	
	//static method to convert celcius to farenheit
	public static String celsiusToFahrenheit(double celsius){
		double fahrenheit = 9 * celsius / 5 +32;
		return String.valueOf(fahrenheit);
	}
	
	//static method to convert celsius to Kelvin
	public static String celsiusToKelvin(double celsius){
		double kelvin = celsius+273.15;
		return String.valueOf(kelvin);
	}
	
	//static method to convert fahrenheit to Kelvin
	public static String fahrenheitToKelvin(double fahrenheit){
		
		String kelvin = celsiusToKelvin(Double.parseDouble(fahrenheitToCelsius(fahrenheit)));
		return kelvin;
	}
	
	//static method to convert Kelvin to Celsius
	public static String kelvinToCelsius(double kelvin){
		double celsius = kelvin - 273.15;
		return String.valueOf(celsius);
	}
	
	//static method to convert Kelvin to Fahrenheit
	public static String kelvinToFahrenheit(double kelvin){
		double celsius = Double.parseDouble(kelvinToCelsius(kelvin));
		String fahrenheit = celsiusToFahrenheit(celsius);
		return String.valueOf(fahrenheit);
	}
	
//******** EVENT HANDLERS  *********
	

	// button press event handler to return to main menu.  
	public void goBack(View view){
		Intent intent = new Intent (this, MainActivity.class);
		startActivity(intent);
	}

	public void calculateTemperature(View view) {

		//The following lines are used to read text from the input box
		double temperature=0;
		EditText initialNumber = (EditText) findViewById(R.id.editInitialTemperature);
		try{
			temperature = Double.parseDouble(initialNumber.getText().toString());
			System.out.println("This is the temperature: "+temperature);

		} catch (NumberFormatException ex){
			//send message
			initialNumber.setText("Enter a number");
		}
		
		//sets the variable outputText
		EditText outputText = (EditText) findViewById(R.id.textResultTemperature);

		String selectionFrom = "C";
		String selectionTo = "F";

		RadioButton radioButton = (RadioButton) findViewById(R.id.radioFromCelsius);
		boolean checked = radioButton.isChecked();
		if (checked==true) selectionFrom="C";
		
		checked = ((RadioButton) findViewById(R.id.radioFromFahrenheit)).isChecked();
		if(checked==true) selectionFrom="F";
		
		checked = ((RadioButton) findViewById(R.id.radioFromKelvin)).isChecked();
		if(checked==true) selectionFrom="K";
		
		
		checked = ((RadioButton) findViewById(R.id.radioToCelsius)).isChecked();
		if(checked==true) selectionTo="C";
		
		
		checked = ((RadioButton) findViewById(R.id.radioToFahrenheit)).isChecked();
		if(checked==true) selectionTo="F";
		
		checked = ((RadioButton) findViewById(R.id.radioToKelvin)).isChecked();
		if(checked==true) selectionTo="K";
		

		
		if (selectionFrom=="C"){
			switch(selectionTo){
			case "C":
				outputText.setText(String.valueOf(temperature));
				break;
			case "F":
				outputText.setText(celsiusToFahrenheit(temperature));
				break;
			case "K":
				outputText.setText(celsiusToKelvin(temperature));
			}
		}
		
		if (selectionFrom=="F"){
			switch(selectionTo){
			case "C":
				outputText.setText(fahrenheitToCelsius(temperature));
				break;
			case "F":
				outputText.setText(String.valueOf(temperature));
				break;
			case "K":
				outputText.setText(fahrenheitToKelvin(temperature));
				break;
			}
		}
		
		if (selectionFrom=="K"){
			switch (selectionTo){
			case "C":
				outputText.setText(kelvinToCelsius(temperature));
				break;
			case "F":
				outputText.setText(kelvinToFahrenheit(temperature));
				break;
			case "K":
				outputText.setText(String.valueOf(temperature));
				
			}
		}
		
	}	

}
