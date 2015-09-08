package edu.sintez.calculator;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

	private EditText display;

	private double firstValue;
	private double secondValue;
	private double totalValue;

	private int plusClick;
	private int minusClick;
	private int multiplyClick;
	private int divideClick;

	private int dotClick;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		display = (EditText)findViewById(R.id.display);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()) {
			case R.id.item_test_1:
				System.out.println("this is test menu 1");
				break;
			case R.id.item_test_2:
				System.out.println("this is test menu 2");
				break;
			case R.id.item_test_3:
				System.out.println("this is test menu 3");
				break;
			default:
				System.out.println("not choose any menu");
				break;
		}
		return super.onMenuItemSelected(featureId, item);
	}


	private static int dispOrient = 0;

	public void buttonClicked(View view){
		switch(view.getId()){
			case R.id.btn_1:
				display.setText(display.getText() + "1");
				break;
			case R.id.btn_2:
				display.setText(display.getText() + "2");
				break;
			case R.id.btn_3:
				display.setText(display.getText() + "3");
				break;
			case R.id.btn_4:
				display.setText(display.getText() + "4");
				break;
			case R.id.btn_5:
				display.setText(display.getText() + "5");
				break;
			case R.id.btn_6:
				display.setText(display.getText() + "6");
				break;
			case R.id.btn_7:
				display.setText(display.getText() + "7");
				break;
			case R.id.btn_8:
				display.setText(display.getText() + "8");
				break;
			case R.id.btn_9:
				display.setText(display.getText() + "9");
				break;
			case R.id.btn_0:
				display.setText(display.getText() + "0");
				break;


			case R.id.btn_plus:
				firstValue = Double.parseDouble( display.getText().toString() );
				display.setText("");
				plusClick = 1;
				dotClick = 0;
				break;

			case R.id.btn_minus:
				firstValue = Double.parseDouble( display.getText().toString() );
				display.setText("");
				minusClick = 1;
				dotClick = 0;
				break;

			case R.id.btn_multiply:
				firstValue = Double.parseDouble( display.getText().toString() );
				display.setText("");
				multiplyClick = 1;
				dotClick = 0;
				break;

			case R.id.btn_divide:
				firstValue = Double.parseDouble( display.getText().toString() );
				display.setText("");
				divideClick = 1;
				dotClick = 0;
				break;



			case R.id.btn_dot:
				if (dotClick == 0) {
					dotClick = 1;
					display.setText(display.getText() + ".");
				}
				break;


			case R.id.btn_clear:
				firstValue = 0;
				secondValue = 0;
				display.setText("");
				dotClick = 0;
				break;


			case R.id.btn_equals:
				secondValue = Double.parseDouble( display.getText().toString() );
				if (plusClick > 0) {
					totalValue = firstValue + secondValue;
					display.setText(String.valueOf(totalValue));
					plusClick = 0;
					dotClick = 0;
					break;
				} else if (minusClick > 0) {
					totalValue = firstValue - secondValue;
					display.setText(String.valueOf(totalValue));
					minusClick = 0;
					dotClick = 0;
					break;
				} else if (multiplyClick > 0) {
					totalValue = firstValue * secondValue;
					display.setText(String.valueOf(totalValue));
					multiplyClick = 0;
					dotClick = 0;
					break;
				} else if (divideClick > 0) {
					totalValue = firstValue / secondValue;
					display.setText(String.valueOf(totalValue));
					divideClick = 0;
					dotClick = 0;
					break;
				}

		}

	}

	public void buttonChangeDispOrient(View view){
		switch(view.getId()){
			case R.id.btn_changeOrientation: asf();
		}

	}

	public void asf(){
		switch (dispOrient){
			case 0:
				System.out.println("vsbgvsrdbgv");
				setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // |||
				dispOrient = 1;
				break;
			case 1:
				System.out.println("sbsrbrs");
				setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // _--
				dispOrient = 0;
				break;
		}
	}


}
