package com.example.android.inclassassignment04_mingk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button mButtonCopy;
    private Button mButtonDouble;
    private Button mButtonUp;
    private Button mButtonDown;


    private TextView userInput;
    private TextView userOutput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (TextView)findViewById(R.id.input_text_view);
        userOutput = (TextView) findViewById(R.id.text_output);


        mButtonCopy = (Button)findViewById(R.id.button_copy);

        mButtonCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView output = (TextView)findViewById(R.id.text_output);
                output.setText(userInput.getText().toString());
            }
        });

        mButtonDouble = (Button)findViewById(R.id.button_double);
        mButtonDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String doubleText = userOutput.getText().toString() + userOutput.getText().toString();
                userOutput.setText(doubleText);
            }
        });


        mButtonUp = (Button)findViewById(R.id.button_up);
        mButtonUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float textSize = userOutput.getTextSize();
                String upText = userOutput.getText().toString();
                userOutput.setTextSize(TypedValue.COMPLEX_UNIT_PX,textSize + 2);
                userOutput.setText(upText);
            }

        });

        mButtonDown = (Button)findViewById(R.id.button_down);
        mButtonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float textSize = userOutput.getTextSize();
                String downText = userOutput.getText().toString();
                userOutput.setTextSize(TypedValue.COMPLEX_UNIT_PX,textSize - 2);
                userOutput.setText(downText);
                }

        });


    }

    public void onResume(){
        super.onResume();
        Toast.makeText(MainActivity.this, "Welcome!", Toast.LENGTH_SHORT).show();
    }
}
