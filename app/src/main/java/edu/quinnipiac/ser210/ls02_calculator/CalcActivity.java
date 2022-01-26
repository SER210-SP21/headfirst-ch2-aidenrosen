package edu.quinnipiac.ser210.ls02_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity
{
	EditText input1, input2;
	TextView res;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button add = (Button) findViewById(R.id.addition);
		Button sub = (Button) findViewById(R.id.subtraction);
		input1 = (EditText) findViewById(R.id.input1);
		input2 = (EditText) findViewById(R.id.input2);
		res = (TextView) findViewById(R.id.result);

		add.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				performOp('+');
			}
		});

		sub.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				performOp('-');
			}
		});


	}

	public void performOp(char op)
	{
		Log.v("Debug", "method performOpcalled");
		if ((input1.getText() != null) && (input2.getText() != null))
		{
			double num1 = Double.valueOf(input1.getText().toString());
			double num2 = Double.valueOf(input2.getText().toString());

			Log.v("Debug", "num 1 " + num1 + "num2" + num2);
			double result = 0;

			switch(op)
			{
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
			}

			res.setText(Double.toString(result));

		}
	}
}