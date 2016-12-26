package edu.niu.cs.z1760203.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    //Declaring instance variables

    EditText num1ET, num2ET;
    TextView resultTV;
    Integer num1,
            num2,
            result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //connect Edittext and Textview objects to screen

        num1ET = (EditText)findViewById(R.id.input1);
        num2ET = (EditText)findViewById(R.id.input2);
        resultTV = (TextView)findViewById(R.id.resultTextView);

        //To add the user-entered numbers

        Button addBtn = (Button)findViewById(R.id.add);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check for data in textfields

                if(num1ET.getText().toString().matches("") ||
                num2ET.getText().toString().matches(""))
                {
                    Toast.makeText(v.getContext(), "Cannot have an empty field", Toast.LENGTH_LONG).show();
                    return;
                }

                //To get the numbers

                num1 = Integer.parseInt(num1ET.getText().toString());
                num2 = Integer.parseInt(num2ET.getText().toString());

                //Calculate the sum

                result = num1 + num2;

                //Display the result

                resultTV.setText(result.toString());

            }
        });

        //To subtract the user-entered numbers

        Button subBtn = (Button)findViewById(R.id.sub);

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check for data in textfields

                if(num1ET.getText().toString().matches("") ||
                        num2ET.getText().toString().matches(""))
                {
                    Toast.makeText(v.getContext(), "Cannot have an empty field", Toast.LENGTH_LONG).show();
                    return;
                }

                //To get the numbers

                num1 = Integer.parseInt(num1ET.getText().toString());
                num2 = Integer.parseInt(num2ET.getText().toString());

                //Calculate the difference

                result = num1 - num2;

                //Display the result

                resultTV.setText(result.toString());

            }
        });

        //To multiply the user-entered numbers

        Button mulBtn = (Button)findViewById(R.id.multiply);

        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check for data in textfields

                if(num1ET.getText().toString().matches("") ||
                        num2ET.getText().toString().matches(""))
                {
                    Toast.makeText(v.getContext(), "Cannot have an empty field", Toast.LENGTH_LONG).show();
                    return;
                }

                //To get the numbers

                num1 = Integer.parseInt(num1ET.getText().toString());
                num2 = Integer.parseInt(num2ET.getText().toString());

                //Calculate the sum

                result = num1 * num2;

                //Display the result

                resultTV.setText(result.toString());

            }
        });

        //To divide the user-entered numbers

        Button divBtn = (Button)findViewById(R.id.divide);

        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check for data in textfields

                if(num1ET.getText().toString().matches("") ||
                        num2ET.getText().toString().matches(""))
                {
                    Toast.makeText(v.getContext(), "Cannot have an empty field", Toast.LENGTH_LONG).show();
                    return;
                }

                //To check for division by zero

                if(num1ET.getText().toString().matches("")  ||
                        num2ET.getText().toString().matches("0"))
                {
                    Toast.makeText(v.getContext(), "Cannot divide a number by Zero", Toast.LENGTH_LONG).show();
                    return;
                }

                //Get the numbers

                num1 = Integer.parseInt(num1ET.getText().toString());
                num2 = Integer.parseInt(num2ET.getText().toString());

                //Calculate the sum

                result = num1 / num2;

                //Display the result

                resultTV.setText(result.toString());

            }
        });

        //To clear the inputs

        Button clearBtn = (Button)findViewById(R.id.clearButton);
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1ET.setText("");
                num2ET.setText("");
                resultTV.setText("");
            }
        });

    }
}
