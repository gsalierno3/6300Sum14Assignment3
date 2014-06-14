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

public class WeightActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weight);
	}
	
	//static method do convert tons to pounds
	public static String britTonsToPounds(double tons){
		double lb=tons*2240;
		return String.valueOf(lb);
	}
	
	//static method do convert tons to ounces
	public static String britTonsToOunces(double tons){
		double oz=tons*2240*16;
		return String.valueOf(oz);
	}
	
	//static method do convert british tons to metric tons
	public static String britTonsToMetricTons(double tons){
	
		double tn = 1.01605 * tons;
		return String.valueOf(tn);
	}
	
	//static method do convert tons to kilograms
	public static String britTonsToKilograms(double tons){
		double kg=1016.05 * tons;
		return String.valueOf(kg);
	}

	//static method do convert tons to grams
	public static String britTonsToGrams(double tons){
		double gr= 1016050 * tons;
		return String.valueOf(gr);
	}

	//static method to convert pounds to Tons (british)
	public static String poundsToBritTons(double lb){
		double tn = lb * 0.000446429;
		return String.valueOf(tn);
	}
	
	//static method to convert pounds to ounces
	public static String poundsToOunces(double lb){
		double oz = lb * 16;
		return String.valueOf(oz);
	}
	
	//static method to convert pounds to metric tons
	public static String poundsToMetricTons(double lb){
		double tn = lb * 0.000453592;
		return String.valueOf(tn);
	}
	
	//static method to convert pounds to kilograms
	public static String poundsToKilograms(double lb){
		double kg = lb * 0.453592;
		return String.valueOf(kg);
	}
	
	//static method to convert pounds to grams
	public static String poundsToGrams(double lb){
		double gr = lb * 453.592;
		return String.valueOf(gr);
	}
	
	//static method to convert ounces to tons
	public static String ouncesToBritTons (double oz){
		double tn = oz * 0.0000279018;
		return String.valueOf(tn);
	}
	

	//static method to convert ounces to pounds
	public static String ouncesToPounds (double oz){
		double lb = oz / 16;
		return String.valueOf(lb);
	}
	
	//static method to convert ounces to pounds
	public static String ouncesToMetricTons (double oz){
		double tn = oz * 0.0000283495;
		return String.valueOf(tn);
	}
	
	//static method to convert ounces to Kilograms
	public static String ouncesToKilograms (double oz){
		double kg = oz * 0.0283495;
		return String.valueOf(kg);
	}
	
	//static method to convert ounces to Grams
	public static String ouncesToGrams (double oz){
		double gr = oz * 28.3495;
		return String.valueOf(gr);
	}
	
	//static method to convert metric tons to british tons
	public static String metricTonsToBritTons (double tn){
		double ton = tn * 0.984207;
		return String.valueOf(ton);
	}
	
	//static method to convert metric tons to pounds
	public static String metricTonsToPounds (double tn){
		double kg= 1000* tn;
		String lb = kilogramsToPounds(kg);
		return lb;
	}
	
	//static method to convert metric tons to ounces
	public static String metricTonsToOunces (double tn){
		double kg= 1000* tn;
		String oz = kilogramsToOunces(kg);
		return oz;
	}
	//static method to convert metric tons to kilograms
	public static String metricTonsToKilogram (double tn){
		double kg= 1000* tn;
		return String.valueOf(kg);
	}
	
	//static method to convert metric tons to grams
	public static String metricTonsToGrams (double tn){
		double gr= 1000000* tn;
		return String.valueOf(gr);
	}
	
	//static method to convert kilograms to British Tons
	public static String kilogramsToBritTons(double kg){
		double ton = kg * 0.000984207;
		return String.valueOf(ton);
	}
	
	//static method to convert kilograms to pounds
	public static String kilogramsToPounds(double kg){
		double lb = kg * 2.20462;
		return String.valueOf(lb);
	}
	
	//static method to convert kilograms to ounces
	public static String kilogramsToOunces(double kg){
		double oz = kg * 2.20462 * 16;
		return String.valueOf(oz);
	}
	
	//static method to convert kilograms to metric tons
	public static String kilogramsToMetricTons(double kg){
		double tn = kg/1000;
		return String.valueOf(tn);
	}
	
	//static method to convert kilograms to grams
	public static String kilogramsToGrams(double kg){
		double gr = kg*1000;
		return String.valueOf(gr);
	}
	
	//static method to convert grams to british tons
	public static String gramsToBritTons(double gr){
		double kg = gr/1000;
		String ton=kilogramsToBritTons(kg);
		return ton;
	}
	
	//static method to convert grams to pounds
	public static String gramsToPounds(double gr){
		double kg = gr/1000;
		String lb=kilogramsToPounds(kg);
		return lb;
	}
	
	//static method to convert grams to ounces
	public static String gramsToOunces(double gr){
		double kg = gr/1000;
		String oz=kilogramsToOunces(kg);
		return oz;
	}
	
	//static method to convert grams to metric tons
	public static String gramsToMetricTons(double gr){
		double tn = gr/1000000;
		return String.valueOf(tn);
	}

	//static method to convert grams to kilograms
	public static String gramsToKilograms(double gr){
		double kg = gr/1000;
		return String.valueOf(kg);
	}

	//******** EVENT HANDLERS  *********	
	
	public void calculateWeight(View view) {

		//The following lines are used to read text from the input box
		double weight=0;
		EditText initialNumber = (EditText) findViewById(R.id.editInitialWeight);
		try{
			weight = Double.parseDouble(initialNumber.getText().toString());
			System.out.println("This is the weight: "+ weight);

		} catch (NumberFormatException ex){
			//send message
			initialNumber.setText("Enter a number");
		}
		
		//sets the variable outputText
		EditText outputText = (EditText) findViewById(R.id.textResultWeight);

		String selectionFrom = "P";
		String selectionTo = "K";

		RadioButton radioButton = (RadioButton) findViewById(R.id.radioFromBritTons);
		boolean checked = radioButton.isChecked();
		if (checked==true) selectionFrom="B";
		
		checked = ((RadioButton) findViewById(R.id.radioFromPounds)).isChecked();
		if(checked==true) selectionFrom="P";
		
		checked = ((RadioButton) findViewById(R.id.radioFromOunces)).isChecked();
		if(checked==true) selectionFrom="O";
		
		checked = ((RadioButton) findViewById(R.id.radioFromMetricTons)).isChecked();
		if(checked==true) selectionFrom="M";
		
		checked = ((RadioButton) findViewById(R.id.radioFromKilograms)).isChecked();
		if(checked==true) selectionFrom="K";
		
		checked = ((RadioButton) findViewById(R.id.radioFromGrams)).isChecked();
		if(checked==true) selectionFrom="G";
		
		checked = ((RadioButton) findViewById(R.id.radioToBritTons)).isChecked();
		if (checked==true) selectionTo="B";
		
		checked = ((RadioButton) findViewById(R.id.radioToPounds)).isChecked();
		if(checked==true) selectionTo="P";
		
		checked = ((RadioButton) findViewById(R.id.radioToOunces)).isChecked();
		if(checked==true) selectionTo="O";
		
		checked = ((RadioButton) findViewById(R.id.radioToMetricTons)).isChecked();
		if(checked==true) selectionTo="M";
		
		checked = ((RadioButton) findViewById(R.id.radioToKilograms)).isChecked();
		if(checked==true) selectionTo="K";
		
		checked = ((RadioButton) findViewById(R.id.radioToGrams)).isChecked();
		if(checked==true) selectionTo="G";
		
		if (selectionFrom=="B"){
			switch (selectionTo){
			case "B":
				outputText.setText(String.valueOf(weight));
				break;
			case "P":
				outputText.setText(britTonsToPounds(weight));
				break;
			case "O":
				outputText.setText (britTonsToOunces(weight));
				break;
			case "M":
				outputText.setText (britTonsToMetricTons(weight));
				break;
			case "K":
				outputText.setText(britTonsToKilograms(weight));
				break;
			case "G":
				outputText.setText (britTonsToGrams(weight));
			}
		}
		if (selectionFrom=="P"){
			switch (selectionTo){
			case "B":
				outputText.setText(poundsToBritTons(weight));
				break;
			case "P":
				outputText.setText(String.valueOf(weight));
				break;
			case "O":
				outputText.setText (poundsToOunces(weight));
				break;
			case "M":
				outputText.setText (poundsToMetricTons(weight));
				break;
			case "K":
				outputText.setText(poundsToKilograms(weight));
				break;
			case "G":
				outputText.setText (poundsToGrams(weight));
			}
		}	
		if (selectionFrom=="O"){
				switch (selectionTo){
				case "B":
					outputText.setText(ouncesToBritTons(weight));
					break;
				case "P":
					outputText.setText(ouncesToPounds(weight));
					break;
				case "O":
					outputText.setText (String.valueOf(weight));
					break;
				case "M":
					outputText.setText (ouncesToMetricTons(weight));
					break;
				case "K":
					outputText.setText(ouncesToKilograms(weight));
					break;
				case "G":
					outputText.setText (ouncesToGrams(weight));
				}
		}
		if (selectionFrom=="M"){
				switch (selectionTo){
				case "B":
					outputText.setText(metricTonsToBritTons(weight));
					break;
				case "P":
					outputText.setText(metricTonsToPounds(weight));
					break;
				case "O":
					outputText.setText (metricTonsToOunces(weight));
					break;
				case "M":
					outputText.setText(String.valueOf(weight));
					break;
				case "K":
					outputText.setText(metricTonsToKilogram(weight));
					break;
				case "G":
					outputText.setText (metricTonsToGrams(weight));
				}
		}

		if (selectionFrom=="K"){
				switch (selectionTo){
				case "B":
					outputText.setText(kilogramsToBritTons(weight));
					break;
				case "P":
					outputText.setText(kilogramsToPounds(weight));
					break;
				case "O":
					outputText.setText (kilogramsToOunces(weight));
					break;
				case "M":
					outputText.setText(kilogramsToMetricTons(weight));
					break;
				case "K":
					outputText.setText(String.valueOf(weight));
					break;
				case "G":
					outputText.setText (kilogramsToGrams(weight));
				}
		}
			
		if (selectionFrom=="G"){
				switch (selectionTo){
				case "B":
					outputText.setText(gramsToBritTons(weight));
					break;
				case "P":
					outputText.setText(gramsToPounds(weight));
					break;
				case "O":
					outputText.setText (gramsToOunces(weight));
					break;
				case "M":
					outputText.setText(gramsToMetricTons(weight));
					break;
				case "K":
					outputText.setText(gramsToKilograms(weight));
					break;
				case "G":
					outputText.setText (String.valueOf(weight));
				}
		}
	
	}
	
	// button press event handler to return to main menu.  
	public void goBack(View view){
		Intent intent = new Intent (this, MainActivity.class);
		startActivity(intent);
	}
	

}
